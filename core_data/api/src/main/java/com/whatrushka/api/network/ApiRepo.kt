package com.whatrushka.api.network

import com.whatrushka.api.models.Quote

interface ApiRepo {
    fun fetchCategories(): List<String>

    suspend fun fetchQuotes(category: String = ""): List<Quote>
}