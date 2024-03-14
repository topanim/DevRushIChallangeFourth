package com.whatrushka.core_navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.whatrushka.core_navigation.routes.Routes


interface NavigationApi {
    val route: Routes

    fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    )
}