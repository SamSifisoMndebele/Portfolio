package com.samsmndebele.plugins

import com.samsmndebele.pages.indexHtml
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.resources.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    install(Resources)
    install(AutoHeadResponse)
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause", status = HttpStatusCode.InternalServerError)
        }
    }
//    install(Thymeleaf) {
//        setTemplateResolver(ClassLoaderTemplateResolver().apply {
//            prefix = "public/"
//            suffix = ".html"
//            characterEncoding = "utf-8"
//        })
//    }

    routing {
        staticResources("/assets", "public/assets")
        staticResources("/public", "public")

        get("/") {
            call.respondHtml { indexHtml() }
        }
//        get("/thymeleaf") {
//            call.respond(ThymeleafContent("index", mapOf("user" to ThymeleafUser(1, "user1"))))
//        }
    }
}