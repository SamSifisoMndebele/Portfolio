package com.samsmndebele

import com.samsmndebele.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import java.math.BigInteger

fun main() {
    embeddedServer(Netty, 8080, "0.0.0.0", module = Application::module)
        .start(true)
}

fun Application.module() {
    configureSecurity()
//    configureHTTP()
    configureSerialization()
    configureRouting()
}
