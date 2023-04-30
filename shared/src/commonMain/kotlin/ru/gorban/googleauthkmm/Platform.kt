package ru.gorban.googleauthkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform