package com.whatrushka.api.data

import com.whatrushka.api.models.Filter

interface FilterService {
    fun fetchFilter(): Filter

    fun setFilter(block: (Filter) -> Unit)
}