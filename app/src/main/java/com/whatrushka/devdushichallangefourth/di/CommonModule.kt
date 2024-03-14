package com.whatrushka.devdushichallangefourth.di

import com.whatrushka.api.data.FilterService
import com.whatrushka.api.models.Filter
import com.whatrushka.api.network.ApiRepo
import com.whatrushka.impl.data.FilterServiceImpl
import com.whatrushka.impl.network.ApiRepoImpl
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val commonModule = module {

    // Network
    single<Logger> {
        object : Logger {
            override fun log(message: String) {
                println("Ktor: $message")
            }
        }
    }

    single<Json> {
        Json {
            isLenient = true
            prettyPrint = true
            ignoreUnknownKeys = true
        }
    }

    single<HttpClient> {
        HttpClient(CIO) {
            install(Logging) { logger = get() }

            install(ContentNegotiation) { json(get()) }
        }
    }

    single<ApiRepo> { ApiRepoImpl(get()) }

    // Storage
    factory <FilterService> { FilterServiceImpl(get()) }

    single<Filter> { Filter("") }

}