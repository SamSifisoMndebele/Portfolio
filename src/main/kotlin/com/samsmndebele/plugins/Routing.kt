package com.samsmndebele.plugins

import com.samsmndebele.pages.indexHtml
import com.samsmndebele.services.Contact
import com.samsmndebele.services.ContactService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.request.*
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

        post("/") {
            try {
                val parameters = call.receiveParameters()
                val name = parameters["name"]!!
                val email = parameters["email"]!!
                val phone = parameters["phone"]
                val message = parameters["message"]!!

                ContactService.create(
                    Contact(
                        name = name,
                        email = email,
                        phone = phone,
                        message = message
                    )
                )

                call.respondHtml(HttpStatusCode.Created) { indexHtml(true) }
            } catch (e: Exception) {
                call.respondHtml(HttpStatusCode.ExpectationFailed) { indexHtml(false) }
            }
        }
    }
}