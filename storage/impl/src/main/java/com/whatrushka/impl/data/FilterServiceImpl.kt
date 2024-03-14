package com.whatrushka.impl.data

import com.whatrushka.api.data.FilterService
import com.whatrushka.api.models.Filter

class FilterServiceImpl(private val filter: Filter) : FilterService {

    override fun fetchFilter(): Filter {
        return filter
    }

    override fun setFilter(block: (Filter) -> Unit) {
        block(filter)
    }

}