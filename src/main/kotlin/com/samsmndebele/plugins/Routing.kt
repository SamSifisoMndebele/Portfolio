package com.samsmndebele.plugins

import io.ktor.http.*
import io.ktor.resources.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.resources.*
import io.ktor.server.resources.Resources
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.li
import kotlinx.html.ul
import kotlinx.serialization.Serializable
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

fun Application.configureRouting() {
    install(Resources)
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause", status = HttpStatusCode.InternalServerError)
        }
    }
    install(AutoHeadResponse)

    install(Thymeleaf) {
        setTemplateResolver(ClassLoaderTemplateResolver().apply {
            prefix = "public/"
            suffix = ".html"
            characterEncoding = "utf-8"
        })
        setTemplateResolver(ClassLoaderTemplateResolver().apply {
            prefix = "dashboard/"
            suffix = ".html"
            characterEncoding = "utf-8"
        })
    }

    routing {
        staticResources("/dashboard/assets", "dashboard/assets")
        staticResources("/assets", "public/assets")

        staticResources("/dashboard", "dashboard")
        staticResources("/", "public")

        get("/dsl") {
            call.respondHtml {
                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }
        get("/thymeleaf") {
            call.respond(ThymeleafContent("index", mapOf("user" to ThymeleafUser(1, "user1"))))
        }
    }
}

data class ThymeleafUser(val id: Int, val name: String)