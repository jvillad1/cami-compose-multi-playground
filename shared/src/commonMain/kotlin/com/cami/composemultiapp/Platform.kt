package com.cami.composemultiapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
