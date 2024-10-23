package com.samsmndebele.utils

import org.intellij.lang.annotations.Language

val emailRegex = Regex("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
        + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
        + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
        + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
        + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
        + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$")

val phoneNumberRegex = Regex("^(0|\\+?27[ -]?)[5-9]\\d[ -]?\\d{3}[ -]?\\d{4}$")

@Language("html")
val CONTACT_EMAIL = """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact - {{name}}</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
        }
        .content {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="content">
            <p><b>Name:</b> {{name}}</p>
            <p><b>Email:</b> {{email}}</p>
            <p><b>Phone:</b> {{phone}}</p>
            <hr>
            <p><b>Message:</b></p>
            <p>{{message}}</p>
        </div>
    </div>
</body>
</html>
""".trimIndent()