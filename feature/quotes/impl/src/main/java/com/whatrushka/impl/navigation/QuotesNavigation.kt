package com.whatrushka.impl.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.whatrushka.api.data.navigation.routes.Quotes
import com.whatrushka.core_navigation.NavigationApi
import com.whatrushka.core_navigation.routes.Routes
import com.whatrushka.impl.data.QuotesViewModel
import com.whatrushka.impl.ui.QuotesScreen
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class QuotesNavigation : NavigationApi, KoinComponent {
    override val route: Routes = Quotes

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route.route) {
            val viewModel: QuotesViewModel by inject()
            QuotesScreen(viewModel, navController, modifier)
        }
    }
}