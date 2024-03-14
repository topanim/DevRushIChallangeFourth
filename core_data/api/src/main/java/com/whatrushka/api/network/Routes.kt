package com.whatrushka.api.network

sealed class Routes(var path: String) {
    data object SCHEME : Routes("https://")
    data object DOMAIN : Routes("api.api-ninjas.com")
    data object Quotes : Routes("/v1/quotes")
}