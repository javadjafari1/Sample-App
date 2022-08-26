package ir.javadjafarii.ui

import androidx.compose.material.ScaffoldState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.homeGraph(navController: NavController, scaffoldState: ScaffoldState) {
    navigation(startDestination = "home", "main") {
        composable("home") {
            HomeScreen(
                navController = navController,
                scaffoldState = scaffoldState
            )
        }
    }
}