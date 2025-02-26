package com.samsmndebele

import com.samsmndebele.plugins.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.resources.*
import java.math.BigInteger

fun main() {
    embeddedServer(Netty, 8080, "0.0.0.0", module = Application::module)
        .start(true)
}

fun Application.module() {
    install(ContentNegotiation) { json() }
    install(CORS) {
        allowMethod(HttpMethod.Options)
        allowMethod(HttpMethod.Head)
        allowMethod(HttpMethod.Get)
        allowMethod(HttpMethod.Post)
        allowMethod(HttpMethod.Put)
        allowMethod(HttpMethod.Patch)

        allowHeader(HttpHeaders.Authorization)

        allowHost("studentintellect.co.za")
        allowHost("samsmndebele.onrender.com/")
        allowHost("samsifisomndebele.studentintellect.co.za")
//        allowHost("localhost:8080")
    }
    install(Resources)
    install(AutoHeadResponse)
    configureStatusPages()
//    configureSecurity()
    configureRouting()
}
