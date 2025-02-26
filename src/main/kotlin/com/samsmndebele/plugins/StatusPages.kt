package com.samsmndebele.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.plugins.statuspages.*
import com.samsmndebele.pages.error

fun Application.configureStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, status ->
            call.respondHtml(status = status) {
                error(status.value, "Page Not Found", "The specified file was not found on this website. Please check the URL for mistakes and try again.")
            }
        }
        exception<Throwable> { call, cause ->
            val status = call.response.status() ?: HttpStatusCode.InternalServerError
            call.respondHtml(status = status) {
                error(status.value, status.description, cause.localizedMessage)
            }
        }
    }
}
