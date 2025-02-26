package com.samsmndebele.pages

import kotlinx.html.*

fun HTML.error(
    code: Int?,
    message: String,
    description: String?
) {
    lang = "en"
    head {

        meta(charset = "utf-8")
        meta(name = "viewport", content = "width=device-width, initial-scale=1")
        meta(name = "author", content = "Sam Sifiso Mndebele")
        link(rel = "stylesheet", type = "text/css", href = "assets/css/error.css") {
            attributes["media"] = "screen"
        }
        link(rel = "icon", type = "image/png", href = "assets/img/favicon.png")

        meta(charset = "utf-8")
        meta(name = "viewport", content = "width=device-width, initial-scale=1, shrink-to-fit=no")
        meta(name = "robots", content = "noindex,nofollow")
        meta(name = "author", content = "Sam Sifiso Mndebele")
        meta(name = "description", content = description)
        title(content = message)
        link(rel = "icon", type = "image/png", href = "assets/images/favicon.png")
        link(rel = "stylesheet", type = "text/css", href = "https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,500,600,700,700i,800,800i,900,900i")
        link(rel = "stylesheet", type = "text/css", href = "assets/css/style.css")
    }
    body {
        div ("content-wrap") {
            div ("cta-box") {
                h1 {
                    span ("highlight") { +(code?.toString() ?: "") }
                }
                p ("subtitle") {
                    b {
                        +message; br
                    }
                    br
                    +(description ?: "")
                }
                a(href = "/", classes = "del-main") {
                    +"Home"
                }
            }
        }

        script(src = "assets/js/firebase.js", type = "module") { async = true }
    }
}