package com.samsmndebele.pages

import kotlinx.html.*
fun UL.navLi(
    title: String,
    href: String,
    icon: String,
) {
    li(classes = "nav-item") {
        a(classes = "nav-link", href = href) {
            div(classes = "icon icon-shape icon-sm shadow border-radius-sm bg-white text-center me-2 d-flex align-items-center justify-content-center") {
                i("$icon text-danger")
            }
            span(classes = "nav-link-text ms-1") { +title }
        }
    }
}