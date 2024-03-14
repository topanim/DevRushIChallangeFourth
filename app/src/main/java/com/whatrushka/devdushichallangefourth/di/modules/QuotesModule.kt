package com.whatrushka.devdushichallangefourth.di.modules

import com.whatrushka.impl.data.QuotesViewModel
import com.whatrushka.impl.navigation.QuotesNavigation
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val quotesModule = module {
    single<QuotesNavigation> { QuotesNavigation() }
    viewModel { QuotesViewModel(get(), get()) }
}