package com.whatrushka.impl.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.whatrushka.api.data.FilterService
import com.whatrushka.api.data.QuotesService
import com.whatrushka.api.models.Filter
import com.whatrushka.api.models.Quote
import com.whatrushka.api.network.ApiRepo
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class QuotesViewModel(
    private val apiRepo: ApiRepo,
    private val filterService: FilterService
) : ViewModel(), QuotesService {
    val quotes = mutableListOf<Quote>()


    override fun fetchFilter() = filterService.fetchFilter()
    override fun configureFilter(block: (Filter) -> Unit) = filterService.setFilter(block)

    override fun fetchQuotes(count: Int) {
        viewModelScope.launch {
            for (i in 0 until count) {
                delay(100)
                quotes.addAll(
                    apiRepo.fetchQuotes(filterService.fetchFilter().category)
                )
            }
        }
    }
}