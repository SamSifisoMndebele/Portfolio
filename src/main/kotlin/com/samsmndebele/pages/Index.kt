package com.samsmndebele.pages

import kotlinx.html.*
import java.time.Year

fun HTML.indexHtml(
    success: Boolean? = null,
) {
    lang = "en"
    head {
        meta(charset = "utf-8")
        meta(name = "viewport", content = "width=device-width, initial-scale=1, shrink-to-fit=no")
        meta(name = "author", content = "Sam Sifiso Mndebele")
        meta(name = "description", content = "Sam Sifiso Mndebele, a creative professional android developer focused on developing android apps with a clean, simple, and easy-to-use life cycle. Nothing is impossible. If you just work hard enough at it.")
        meta(name = "keywords", content = "Sam Mndebele, mndebele, android developer, java, kotlin, android, best developer, website, android app, web app, apps")
        title(content = "Sam Portfolio")
        link(rel = "icon", type = "image/png", href = "assets/img/favicon.png")
        link(rel = "stylesheet", type = "text/css", href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css")
//        link(rel = "stylesheet", type = "text/css", href = "https://fonts.googleapis.com/css2?family=Montserrat:wght@500;700&amp;display=swap")
        link(rel = "stylesheet", type = "text/css", href = "assets/vendors/themify-icons/css/themify-icons.css")
        link(rel = "stylesheet", type = "text/css", href = "assets/css/header.css")
        link(rel = "stylesheet", type = "text/css", href = "assets/css/style.css")
        link(rel = "stylesheet", type = "text/css", href = "assets/css/loader.css")
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
                id = "header"
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
                        a ("mailto: sams.mndebele@studentintellect.co.za", "_blank", "social-link text-light") {
                            i ("fa-regular fa-envelope")
                        }
                    }
                }
                div ("header-content") {
                    style = "padding-left: 8vw; padding-right: 8vh"
                    h4 ("header-subtitle") { +"I am" }
                    h1 ("header-title") {
                        span { +"S" }
                        span { +"A" }
                        span { +"M" }
                        +" "
                        span { +"S" }
                        span { +"I" }
                        span { +"F" }
                        span { +"I" }
                        span { +"S" }
                        span { +"O" }
                    }
                    h1 ("header-title") {
                        span { +"M" }
                        span { +"N" }
                        span { +"D" }
                        span { +"E" }
                        span { +"B" }
                        span { +"E" }
                        span { +"L" }
                        span { +"E" }
                    }
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
//                        li ("nav-item") {
//                            a("#portfolio", classes = "nav-link") { +"Portfolio" }
//                        }
//                        li ("nav-item") {
//                            a("#blog", classes = "nav-link") { +"Blog" }
//                        }
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
//                    a ("docs/resume", "_blank", "btn btn-primary btn-rounded") {
//                        i ("ti-printer pr-2")
//                        +"View Resume"
//                    }
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
                        li { span { +"Email" }; +" : sams.mndebele@studentintellect.co.za" }
                        li { span { +"Phone" }; +" : +27 72 164 6430" }
                        li { span { +"Address" }
                            +" : 104 Clau-Clau, No. 2"; br()
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
                            a("mailto: sams.mndebele@studentintellect.co.za", "_blank", "social-link") { i("fa-regular fa-envelope") }
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
        section ("section bg-custom-gray") {
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
                                i ("ti-mobile text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Android Development" }
                                p ("subtitle") { +"With expertise in Java and Kotlin, I develop native Android applications that are user-friendly and feature-rich. My Android development skills ensure that apps are optimized for performance, security, and compatibility across a wide range of devices." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-world text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Web Application Development" }
                                p ("subtitle") { +"I specialize in creating custom web applications that perfectly align with client needs. Utilizing the latest technologies and frameworks, I develop robust, scalable, and high-performing web solutions that offer seamless user experiences." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-harddrives text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Back-End Development" }
                                p ("subtitle") { +"I am proficient in designing and developing server-side applications using frameworks like Node.js, Express, and Django. My back-end solutions are reliable, secure, and capable of handling high volumes of traffic, ensuring optimal performance and stability." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-server text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"Database Management" }
                                p ("subtitle") { +"I provide comprehensive database management services, including design, development, and maintenance. Using SQL and NoSQL technologies like MySQL, PostgreSQL, and MongoDB, I ensure that databases are efficiently organized and easily accessible." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-cloud text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"API Development and Integration" }
                                p ("subtitle") { +"I offer API development and integration services to enhance the functionality of web applications. By creating and integrating RESTful APIs with Ktor, I enable seamless communication between different services and platforms." }
                            }
                        }
                    }
                    div ("col-md-4 col-sm-6") {
                        div ("card mb-5") {
                            div ("card-header has-icon") {
                                i ("ti-bag text-danger") {
                                    attributes["aria-hidden"] = "true"
                                }
                            }
                            div ("card-body px-4 py-3") {
                                h5 ("mb-3 card-title text-dark") { +"E-commerce Solutions" }
                                p ("subtitle") { +"I create and optimize e-commerce websites with functionalities such as online stores, payment gateways, and inventory management. My e-commerce solutions are tailored to meet the unique needs of each business, ensuring a smooth and secure online shopping experience." }
                            }
                        }
                    }
                }
            }
        }
        /// Services Section End


//        section("section bg-custom-gray") {
//            id = "price"
//            div("container") {
//                h1("mb-5") {
//                    span("text-danger") { +"Developer" }
//                    +" Pricing"
//                }
//                div("row align-items-center") {
//                    div("col-md-6 col-lg-3") {
//                        div("price-card text-center mb-4") {
//                            h3("price-card-title") { +"Portfolio" }
//                            div("price-card-cost") {
//                                sup { +"R"}
//                                span("num") { +"300" }
//                                span("date") { +"once" }
//                            }
//                            ul("list") {
//                                li("list-item") { +"Single Page Website" }
//                                li("list-item") { +"Custom Branding" }
//                                li("list-item") { +"No Custom Domain" }
//                                li("list-item") { +"No Professional Email" }
//                            }
////                            button(classes = "btn btn-primary btn-rounded w-lg") { +"Subscribe" }
//                        }
//                    }
//
//                    div("col-md-6 col-lg-3") {
//                        div("price-card text-center mb-4") {
//                            h3("price-card-title") { +"Portfolio" }
//                            div("price-card-cost") {
//                                sup { +"R"}
//                                span("num") { +"600" }
//                                span("date") { +"pa" }
//                            }
//                            ul("list") {
//                                li("list-item") { +"Many Pages Website" }
//                                li("list-item") { +"Custom Branding" }
//                                li("list-item") { +"Custom Domain" }
//                                li("list-item") { +"1 Professional Email" }
//                            }
////                            button(classes = "btn btn-primary btn-rounded w-lg") { +"Subscribe" }
//                        }
//                    }
//
//                    div("col-md-6 col-lg-3") {
//                        div("price-card text-center price-card-required mb-4") {
//                            h3("price-card-title") { +"E-Commerce" }
//                            div("price-card-cost") {
//                                sup { +"R"}
//                                span("num") { +"150" }
//                                span("date") { +"pm" }
//                            }
//                            ul("list") {
//                                li("list-item") { +"100+ Products" }
//                                li("list-item") { +"Custom Branding" }
//                                li("list-item") { +"Custom Domain" }
//                                li("list-item") { +"5 Professional Email" }
//                            }
////                            button(classes = "btn btn-primary btn-rounded w-lg") { +"Subscribe" }
//                        }
//                    }
//
//                    div("col-md-6 col-lg-3") {
//                        div("price-card text-center mb-4") {
//                            h3("price-card-title") { +"Mobile App" }
//                            div("price-card-cost") {
//                                sup { +"R"}
//                                span("num") { +"1500" }
//                                span("date") { +"+" }
//                            }
//                            ul("list") {
//                                li("list-item") { +"Any Idea" }
//                                li("list-item") { +"10GB Storage" }
//                                li("list-item") { +"Landing Web page" }
//                                li("list-item") { +"Monetization" }
//                            }
////                            button(classes = "btn btn-primary btn-rounded w-lg") { +"Subscribe" }
//                        }
//                    }
//                }
//            }
//
//        }

        section("section bg-dark py-5") {
            div("container text-center") {
                h2("text-light mb-5 font-weight-normal") { +"I Am Available For FreeLance" }
                a("#contact", classes = "btn bg-primary w-lg") { +"Hire Me" }
            }
        }

        /// Contact Section
        div("section contact") {
            id = "contact"
            iframe(classes = "map") {
                id = "map"
                width = "100%"
                style = "border:0;"
                attributes["loading"] = "lazy"
                attributes["referrerpolicy"] = "no-referrer-when-downgrade"
                attributes["allowfullscreen"] = ""
                src = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d225.33269586726652!2d31.154130775885324!3d-25.360484570110884!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1ee839ca74913f63%3A0x5bed9ed642e818e8!2sAVIDCo!5e0!3m2!1sen!2sza!4v1729181807545!5m2!1sen!2sza"
            }
            div("container") {
                div("row") {
                    div("col-lg-8") {
                        div("contact-form-card") {
                            h4("contact-title") { +"Get in Touch" }
                            form(action = "/", encType = FormEncType.applicationXWwwFormUrlEncoded, method = FormMethod.post) {
                                div("form-group") {
                                    textInput(classes = "form-control", name = "name") {
                                        id = "name"
                                        required = true
                                        placeholder = "Name(s) *"
                                        pattern = "[a-zA-Z '.]{2,}"
                                    }
                                }
                                div("form-group") {
                                    emailInput(classes = "form-control", name = "email") {
                                        id = "email"
                                        required = true
                                        placeholder = "Email *"
                                    }
                                }
                                div("form-group") {
                                    telInput(classes = "form-control", name = "phone") {
                                        id = "phone"
                                        required = false
                                        placeholder = "Phone"
                                    }
                                }
                                div("form-group") {
                                    textArea(classes = "form-control", rows = "7") {
                                        id = "message"
                                        name = "message"
                                        required = true
                                        placeholder = "Message *"
                                    }
                                }
                                div("form-group text-center") {
                                    button(classes = "form-control text-center btn btn-primary", type = ButtonType.submit) {
                                        id = "button"
                                        style = "height: 50px !important"
                                        +"Send Message"
                                    }
                                }
                            }
                        }
                    }
                    div("col-lg-4") {
                        div("contact-info-card") {
                            h4("contact-title") { +"Get in touch" }

                            div("row mb-2") {
                                div("col-1 pt-1 mr-1") { i("ti-mobile icon-md") {} }
                                div("col-10") {
                                    h6("d-inline") { +"Phone :" }
                                    br()
                                    span("text-muted") { +" +27 72 164 6430" }
                                }
                            }
                            div("row mb-2") {
                                div("col-1 pt-1 mr-1") { i("ti-map-alt icon-md") {} }
                                div("col-10") {
                                    h6("d-inline") { +"Address :" }
                                    br()
                                    span("text-muted") {
                                        +"104 Clau-Clau, No. 2"; br()
                                        +"Kabokweni, 1245, MP"
                                    }
                                }
                            }
                            div("row mb-2") {
                                div("col-1 pt-1 mr-1") { i("fa-regular fa-envelope icon-md") {} }
                                div("col-10") {
                                    h6("d-inline") { +"Email :" }
                                    br()
                                    span("text-muted") { +" sams.mndebele@studentintellect.co.za" }
                                }
                            }
                            ul("social-icons pt-4") {
                                li("social-item") {
                                    a("https://github.com/SamSifisoMndebele", "_blank", "social-link text-dark") {
                                        i ("fa-brands fa-github") { attributes["aria-hidden"] = "true" }
                                    }
                                }
                                li("social-item") {
                                    a("https://www.facebook.com/sam.sifiso.mndebele", "_blank", "social-link text-dark") {
                                        i ("fa-brands fa-facebook-f") { attributes["aria-hidden"] = "true" }
                                    }
                                }
                                li("social-item") {
                                    a("https://wa.me/27721646430?text=Hi Sam", "_blank", "social-link text-dark") {
                                        i ("fa-brands fa-whatsapp") { attributes["aria-hidden"] = "true" }
                                    }
                                }
                                li("social-item") {
                                    a("mailto: sams.mndebele@studentintellect.co.za", "_blank", "social-link text-dark") {
                                        i("fa-regular fa-envelope") { attributes["aria-hidden"] = "true" }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        /// Contact Section End

        footer("footer py-3") {
            div("container") {
//                onClickFunction = { event ->
//                    window.alert("I was clicked - ${event.timeStamp}")
//                }
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

        // Index
        script(src = "assets/js/index.js") {}

        // Header
        script(src = "assets/js/header.js", type = "module") {}

        // Form
//        script(src = "assets/js/form.js", type = "module") {}

        if (success != null && success) {
            script(src = "assets/js/success.js") { defer = true; async = false }
        } else if (success != null) {
            script(src = "assets/js/error.js") { defer = true; async = false }
        }
    }
}