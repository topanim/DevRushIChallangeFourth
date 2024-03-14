package com.whatrushka.devdushichallangefourth.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.whatrushka.api.data.navigation.routes.Quotes
import com.whatrushka.core_navigation.register
import com.whatrushka.core_navigation.routes.Routes
import com.whatrushka.impl.navigation.QuotesNavigation
import org.koin.compose.koinInject

@Composable
fun MainScreenNavigation(modifier: Modifier) {
    val navController = rememberNavController()

    val quotesFeature: QuotesNavigation = koinInject()

    NavHost(
        navController = navController,
        startDestination = Quotes.route
    ) {
        register(quotesFeature, navController, modifier)
    }
}