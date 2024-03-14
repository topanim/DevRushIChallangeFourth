package com.whatrushka.api.data

import com.whatrushka.api.models.Filter

interface QuotesService {
    fun fetchFilter(): Filter
    fun configureFilter(block: (Filter) -> Unit)

    fun fetchQuotes(count: Int = 10)
}