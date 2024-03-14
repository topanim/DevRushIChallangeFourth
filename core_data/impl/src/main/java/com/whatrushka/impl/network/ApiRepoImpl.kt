package com.whatrushka.impl.network

import com.whatrushka.api.models.Quote
import com.whatrushka.api.network.ApiRepo
import com.whatrushka.api.network.Routes
import com.whatrushka.api.static.categories
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.appendPathSegments

class ApiRepoImpl(private val client: HttpClient) : ApiRepo {
    override fun fetchCategories(): List<String> {
        return categories
    }

    override suspend fun fetchQuotes(category: String): List<Quote> =
        client.get {
            url {
                appendPathSegments(
                    Routes.SCHEME.path,
                    Routes.DOMAIN.path,
                    Routes.Quotes.path
                )

                headers
                    .append("X-Api-Key", "")

                parameters
                    .append("category", category)
            }
        }.body<List<Quote>>()
}