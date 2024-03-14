package com.whatrushka.core_navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation

fun NavGraphBuilder.register(
    feature: NavigationApi,
    navController: NavHostController,
    modifier: Modifier
) {
    feature.registerGraph(
        navGraphBuilder = this,
        navController = navController,
        modifier = modifier
    )
}