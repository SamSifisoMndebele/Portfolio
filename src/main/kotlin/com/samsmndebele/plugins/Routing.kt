package com.samsmndebele.plugins

import com.samsmndebele.firebase.Firebase
import com.samsmndebele.pages.indexHtml
import com.samsmndebele.services.Contact
import com.samsmndebele.utils.await
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
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

                val contact = Contact(
                    name = name,
                    email = email,
                    phone = phone,
                    message = message
                )
                Firebase.firestore.collection("contacts").add(contact).await()
//                ContactService.create(contact)

                call.respondHtml(HttpStatusCode.Created) { indexHtml(true) }
            } catch (_: Exception) {
                call.respondHtml(HttpStatusCode.ExpectationFailed) { indexHtml(false) }
            }
        }
    }
}