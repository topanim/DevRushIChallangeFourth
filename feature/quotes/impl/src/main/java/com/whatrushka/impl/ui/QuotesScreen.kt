package com.whatrushka.impl.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.whatrushka.api.models.Quote
import com.whatrushka.impl.data.QuotesViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun QuotesScreen(
    viewModel: QuotesViewModel,
    navController: NavController,
    modifier: Modifier
) {
    val pagerState = rememberPagerState(0,0f) { viewModel.quotes.size }

    Box(modifier) {

        QuotesFilter(Modifier)

        VerticalPager(pagerState, key = { it }) {
            QuoteItem(viewModel.quotes[it])
        }
    }
}

@Composable
fun QuoteItem(quote: Quote) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxSize()
        ) {
            Text(quote.content)
            Text(quote.author)
        }

    }
}