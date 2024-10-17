package com.samsmndebele.pages

import kotlinx.html.*
import java.time.Year

fun HTML.indexHtml() {
    lang = "en"
    head {
        meta(charset = "utf-8")
        meta(name = "viewport", content = "width=device-width, initial-scale=1, shrink-to-fit=no")
        meta(name = "description", content = "Sam Sifiso Mndebele")
        meta(name = "author", content = "Sam Sifiso Mndebele")
        title("Sam Portfolio")

        link(rel = "icon", type = "image/png", href = "assets/img/favicon.png")
        link(
            rel = "stylesheet",
            type = "text/css",
            href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
        )
        link(rel = "stylesheet", type = "text/css", href = "assets/vendors/themify-icons/css/themify-icons.css")
        link(rel = "stylesheet", type = "text/css", href = "assets/css/style.css")
    }
    body {
        attributes["data-spy"] = "scroll"
        attributes["data-target"] = ".navbar"
        attributes["data-offset"] = "40"
        id = "home"

        div ("btn-back_to_top") {
            span ("ti-arrow-up")
        }
        a (classes = "btn btn-primary btn-component") {
            attributes["data-spy"] = "affix"
            attributes["data-offset-top"] = "600"

            i ("ti-arrow-up") { +" Up" }
        }
        header ("header") {
            div ("container") {
                style = "max-width: 100vw !important;"
                ul ("social-icons pt-3") {
                    style = "padding-left: 32px;"
                    li ("social-item") {
                        a ("https://github.com/SamSifisoMndebele", "_blank", "social-link text-light"
                        ) {
                            i ("fa-brands fa-github")
                        }
                    }
                    li ("social-item") {
                        a ("https://www.facebook.com/sam.sifiso.mndebele", "_blank", "social-link text-light") {
                            i ("fa-brands fa-facebook-f")
                        }
                    }
                    li ("social-item") {
                        a ("https://wa.me/27721646430?text=Hi Sam", "_blank", "social-link text-light") {
                            i ("fa-brands fa-whatsapp")
                        }
                    }
                    li ("social-item") {
                        a ("mailto: sams.mndebele@gmail.com", "_blank", "social-link text-light") {
                            i ("fa-regular fa-envelope")
                        }
                    }
                }
                div ("header-content") {
                    style = "padding-left: 8vw; padding-right: 8vh"
                    h4 ("header-subtitle") { +"Hello, I am" }
                    h1 ("header-title") { +"Sam Sifiso" }
                    h1 ("header-title") { +"Mndebele" }
                    h6 ("header-mono") { +"Full Stack Developer" }
                }
            }
        }

        nav ("navbar sticky-top navbar-expand-lg navbar-light bg-white") {
            attributes["data-spy"] = "affix"
            attributes["data-offset-top"] = "510"

            div ("container") {
                button (classes = "navbar-toggler ml-auto", type = ButtonType.button) {
                    attributes["data-toggle"] = "collapse"
                    attributes["data-target"] = "#navbarSupportedContent"
                    attributes["aria-controls"] = "navbarSupportedContent"
                    attributes["aria-controls"] = "Toggle navigation"
                    attributes["aria-label"] = "false"

                    span ("navbar-toggler-icon")
                }
                div ("collapse mt-sm-20 navbar-collapse") {
                    id = "navbarSupportedContent"
                    ul ("navbar-nav mr-auto") {
                        li ("nav-item") {
                            a("#home", classes = "nav-link") { +"Home" }
                        }
                        li ("nav-item") {
                            a("#about", classes = "nav-link") { +"About" }
                        }
                        li ("nav-item") {
                            a("#resume", classes = "nav-link") { +"Resume" }
                        }
                    }
                    ul ("navbar-nav brand") {
                        img(src = "assets/img/avatar.jpg", alt = "", classes = "brand-img")
                        li ("brand-txt") {
                            h5 ("brand-title") { +"Sam Sifiso Mndebele" }
                            div ("brand-subtitle") { +"Full Stack Developer" }
                        }
                    }
                    ul ("navbar-nav ml-auto") {
                        li ("nav-item") {
                            a("#portfolio", classes = "nav-link") { +"Portfolio" }
                        }
                        li ("nav-item") {
                            a("#blog", classes = "nav-link") { +"Blog" }
                        }
                        li ("nav-item") {
                            a("#contact", classes = "nav-link") { +"Contact" }
                        }
                    }
                }
            }
        }

        /// About Section
        div ("container-fluid") {
            div("row about-section") {
                id = "about"

                div("col-lg-4 about-card") {
                    h3 ("font-weight-light") { +"Who am I ?" }
                    span ("line mb-4")
                    h5 ("mb-3") { +"A Web and Mobile Developer" }
                    p ("mt-20") {
                        +"I'm an Android and Web Developer with a knack for crafting seamless digital experiences. "
                        +"With expertise in creating dynamic, user-friendly applications and websites, "
                        +"I thrive on solving complex problems with innovative solutions. "
                        +"My passion lies in bridging the gap between design and functionality, "
                        +"ensuring every project I work on is both visually stunning and technically sound. "
                        +"Whether it's building a mobile app from scratch or designing a responsive web interface, "
                        +"I bring a blend of creativity and technical prowess to everything I do."
                    }
                    a ("docs/resume", "_blank", "btn btn-primary btn-rounded") {
                        i ("ti-printer pr-2")
                        +"View Resume"
                    }
                }

                div("col-lg-4 about-card") {
                    h3 ("font-weight-light") { +"Personal Info" }
                    span ("line mb-5") {}
                    ul ("mt40 info list-unstyled") {
                        li { span { +"Title" }; +" : Mr" }
                        li { span { +"First Names" }; +" : Sam Sifiso" }
                        li { span { +"Family Name" }; +" : Mndebele" }
                        li { span { +"Birthdate" }; +" : 15 March" }
                        li { span { +"Nationality" }; +" : South African" }
                        li { span { +"Email" }; +" : sams.mndebele@gmail.com" }
                        li { span { +"Phone" }; +" : +27 72 164 6430" }
                        li { span { +"Address" }
                            +" : 104 Clau-Clau No. 2"; br()
                            +"Kabokweni, 1245"; br()
                            +"Mbombela, MP"
                        }
                    }
                    ul ("social-icons pt-3") {
                        li("social-item") {
                            a("https://github.com/SamSifisoMndebele", "_blank", "social-link") { i ("fa-brands fa-github") }
                        }
                        li("social-item") {
                            a("https://www.facebook.com/sam.sifiso.mndebele", "_blank", "social-link") { i ("fa-brands fa-facebook-f") }
                        }
                        li("social-item") {
                            a("https://wa.me/27721646430?text=Hi Sam", "_blank", "social-link") { i ("fa-brands fa-whatsapp") }
                        }
                        li("social-item") {
                            a("mailto: sams.mndebele@gmail.com", "_blank", "social-link") { i("fa-regular fa-envelope") }
                        }
                    }
                }

                div("col-lg-4 about-card") {
                    h3 ("font-weight-light") { +"My Expertise" }
                    span ("line mb-5")

                    div("row") {
                        div("col-1 text-danger pt-1") { i ("ti-mobile icon-lg") }
                        div("col-10 ml-auto mr-3") {
                            h6 { +"Web & Mobile App Development" }
                            p ("subtitle") { +"Building responsive and dynamic websites and robust Android applications with a focus on performance, usability, and seamless integration across devices." }
                            hr()
                        }
                    }

                    div("row") {
                        div("col-1 text-danger pt-1") { i ("ti-server icon-lg") }
                        div("col-10 ml-auto mr-3") {
                            h6 { +"Backend Development" }
                            p ("subtitle") { +"Implementing secure and efficient server-side logic, APIs, and databases." }
                            hr()
                        }
                    }

                    div("row") {
                        div("col-1 text-danger pt-1") { i ("ti-shopping-cart-full icon-lg") }
                        div("col-10 ml-auto mr-3") {
                            h6 { +"Ecommerce" }
                            p ("subtitle") { +"Initiating and developing ecommerce platforms that offer seamless shopping experiences, from product browsing to secure checkout, ensuring they meet user needs and industry standards." }
                            hr()
                        }
                    }
                }
            }
        }
        /// About Section End

        /// Resume Section
        section ("section") {
            id = "resume"
            div ("container") {
                h2 ("mb-5") {
                    span ("text-danger") { +"My" }
                    +" Resume"
                }
                div ("row") {
                    div ("col-md-6 col-lg-6") {
                        div ("card") {
                            div ("card-header") {
                                div ("mt-2") {
                                    h4 { +"Education" }
                                    span ("line")
                                }
                            }
                            div ("card-body") {
                                h6 ("title text-danger") { +"2022 - Present" }
                                h5 { +"BSc Mathematical Science: Computer Science" }
                                p { +"University of Limpopo" }
                                p ("subtitle") {
                                    +"Surrounded by a community of like-minded peers and lecturers, I delved deep into advanced programming, data structures, and algorithms. "
                                    +"I undertook various projects that challenged me to apply theoretical knowledge to real-world problems, "
                                    +"from creating innovative mobile applications to developing complex web platforms. "
                                    +"These experiences not only honed my technical skills but also instilled a strong sense of teamwork and collaboration, "
                                    +"as I often worked in multidisciplinary teams."
                                }
                                hr()
                                h6 ("title text-danger") { +"2018 - 2021" }
                                h5 { +"Self Learning Programming" }
                                p ("subtitle") {
                                    +"I started learning how to program websites, mobile apps, and games, and I became more interested in the field of computer science. "
                                    +"I became passionate about being an expert in this field by channeling knowledge and skills to ensure personal and professional growth."
                                }
                                hr()
                                h6 ("title text-danger") { +"2013 - 2017" }
                                h5 { +"Mhlume Secondary School" }
                                p ("subtitle") {
                                    +"Admission to bachelor's degree"; br
                                }
                            }
                        }
                    }
                    div ("col-lg-6") {
                        div ("card") {
                            div ("card-header") {
                                div ("pull-left") {
                                    h4 ("mt-2") { +"Skills" }
                                    span ("line") {}
                                }
                            }
                            div ("card-body pb-2") {
                                h6 { +"Java and Kotlin" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 99%"
                                        attributes["aria-valuenow"] = "99"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"Python" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 75%"
                                        attributes["aria-valuenow"] = "75"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"SQL" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 95%"
                                        attributes["aria-valuenow"] = "95"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"Assembly" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 80%"
                                        attributes["aria-valuenow"] = "80"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"HTML5 & CSS3" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 85%"
                                        attributes["aria-valuenow"] = "85"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"JavaScript" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 90%"
                                        attributes["aria-valuenow"] = "90"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"PHP" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 60%"
                                        attributes["aria-valuenow"] = "60"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                            }
                        }
                        div ("card") {
                            div ("card-header") {
                                div ("pull-left") {
                                    h4 ("mt-2") { +"Languages" }
                                    span ("line") {}
                                }
                            }
                            div ("card-body pb-2") {
                                h6 { +"English" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 80%"
                                        attributes["aria-valuenow"] = "25"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"SiSwati" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 97%"
                                        attributes["aria-valuenow"] = "25"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                                h6 { +"Pedi" }
                                div ("progress mb-3") {
                                    div ("progress-bar bg-danger") {
                                        role = "progressbar"
                                        style = "width: 40%"
                                        attributes["aria-valuenow"] = "40"
                                        attributes["aria-valuemin"] = "0"
                                        attributes["aria-valuemax"] = "100"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        /// Resume Section End

        section ("section bg-dark text-center") {
            div ("container") {
                div ("row text-center") {
                    div ("col-md-6 col-lg-3") {
                        div ("row") {
                            div ("col-5 text-right text-light border-right py-3") {
                                div ("m-auto") { i ("ti-alarm-clock icon-xl") {} }
                            }
                            div ("col-7 text-left py-3") {
                                h1 ("text-danger font-weight-bold font40") { +"1k" }
                                p ("text-light mb-1") { +"Hours Worked" }
                            }
                        }
                    }
                    div ("col-md-6 col-lg-3") {
                        div ("row") {
                            div ("col-5 text-right text-light border-right py-3") {
                                div ("m-auto") { i ("ti-layers-alt icon-xl") }
                            }
                            div ("col-7 text-left py-3") {
                                h1 ("text-danger font-weight-bold font40") { +"30+" }
                                p ("text-light mb-1") { +"Project Finished" }
                            }
                        }
                    }
                    div ("col-md-6 col-lg-3") {
                        div ("row") {
                            div ("col-5 text-right text-light border-right py-3") {
                                div ("m-auto") { i ("ti-face-smile icon-xl") }
                            }
                            div ("col-7 text-left py-3") {
                                h1 ("text-danger font-weight-bold font40") { +"20+" }
                                p ("text-light mb-1") { +"Happy Clients" }
                            }
                        }
                    }
                    div ("col-md-6 col-lg-3") {
                        div ("row") {
                            div ("col-5 text-right text-light border-right py-3") {
                                div ("m-auto") { i ("ti-heart-broken icon-xl") }
                            }
                            div ("col-7 text-left py-3") {
                                h1 ("text-danger font-weight-bold font40") { +"1k" }
                                p ("text-light mb-1") { +"Coffee Drank" }
                            }
                        }
                    }
                }
            }
        }

        /// Services Section
        /*section ("section") {
            id = "service"
            div ("container") {
                h2 ("mb-5 pb-4") {
                    span ("text-danger") { +"My" }
                    +" Services"
                }
                div ("row") {
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-vector text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Ullam" }
                                p ("subtitle") { +"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam commodi provident, dolores reiciendis enim pariatur error optio, tempora ex, nihil nesciunt! In praesentium sunt commodi, unde ipsam ex veritatis laboriosam dolor asperiores suscipit blanditiis, dignissimos quos nesciunt nulla aperiam officia." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-write text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Asperiores" }
                                p ("subtitle") { +"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam commodi provident, dolores reiciendis enim pariatur error optio, tempora ex, nihil nesciunt! In praesentium sunt commodi, unde ipsam ex veritatis laboriosam dolor asperiores suscipit blanditiis, dignissimos quos nesciunt nulla aperiam officia." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-package text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Tempora" }
                                p ("subtitle") { +"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam commodi provident, dolores reiciendis enim pariatur error optio, tempora ex, nihil nesciunt! In praesentium sunt commodi, unde ipsam ex veritatis laboriosam dolor asperiores suscipit blanditiis, dignissimos quos nesciunt nulla aperiam officia." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-map-alt text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Provident" }
                                p ("subtitle") { +"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam commodi provident, dolores reiciendis enim pariatur error optio, tempora ex, nihil nesciunt! In praesentium sunt commodi, unde ipsam ex veritatis laboriosam dolor asperiores suscipit blanditiis, dignissimos quos nesciunt nulla aperiam officia." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-bar-chart text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Consectetur" }
                                p ("subtitle") { +"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam commodi provident, dolores reiciendis enim pariatur error optio, tempora ex, nihil nesciunt! In praesentium sunt commodi, unde ipsam ex veritatis laboriosam dolor asperiores suscipit blanditiis, dignissimos quos nesciunt nulla aperiam officia." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-support text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Veritatis" }
                                p ("subtitle") { +"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam commodi provident, dolores reiciendis enim pariatur error optio, tempora ex, nihil nesciunt! In praesentium sunt commodi, unde ipsam ex veritatis laboriosam dolor asperiores suscipit blanditiis, dignissimos quos nesciunt nulla aperiam officia." }
                            }
                        }
                    }
                }
            }
        }*/
        /// Services Section End


        footer("footer py-3") { 
            div("container") {
                p("small mb-0 text-light") {
                    +"© "
                    +Year.now().toString()
                    +" Created With "
                    i("ti-heart text-danger")
                    +" by "
                    span("text-danger") {
                        title = "Developer"
                        +"Sam Sifiso Mndebele"
                    }
                }
            }
        }

        // Core
        script(src = "assets/vendors/jquery/jquery-3.4.1.js") {}
        script(src = "assets/vendors/bootstrap/bootstrap.bundle.js") {}

        // Bootstrap 3 affix
        script(src = "assets/vendors/bootstrap/bootstrap.affix.js") {}

        // Isotope
        script(src = "assets/vendors/isotope/isotope.pkgd.js") {}

        // Google Maps
        script(src = "https://maps.googleapis.com/maps/api/js?key=AIzaSyCtme10pzgKSPeJVJrG1O3tjR6lk98o4w8&callback=initMap") {
            async = true; defer = true
        }

        // Index
        script(src = "assets/js/index.js") {}
    }
}