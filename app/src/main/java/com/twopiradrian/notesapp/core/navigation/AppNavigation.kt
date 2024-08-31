package com.twopiradrian.notesapp.core.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.twopiradrian.notesapp.domain.usecases.UseCases
import com.twopiradrian.notesapp.ui.app.ContentType
import com.twopiradrian.notesapp.ui.app.NavigationType
import com.twopiradrian.notesapp.ui.screen.home.HomeScreen
import com.twopiradrian.notesapp.ui.screen.home.viewmodel.HomeViewModelFactory

@Composable
fun AppNavigation (
    navigationType: NavigationType,
    contentType: ContentType,
    useCases: UseCases
){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.Home.route) {
        composable(AppScreens.Home.route) {
            HomeScreen(
                navController = navController,
                navigationType = navigationType,
                contentType = contentType,
                viewModel = viewModel(factory = HomeViewModelFactory(useCases)),
            )
        }
    }
}