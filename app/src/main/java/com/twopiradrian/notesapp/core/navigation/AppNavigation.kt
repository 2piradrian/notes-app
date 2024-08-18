package com.twopiradrian.notesapp.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.twopiradrian.notesapp.ui.app.ContentType
import com.twopiradrian.notesapp.ui.app.NavigationType

@Composable
fun AppNavigation (
    navigationType: NavigationType,
    contentType: ContentType
){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.Home.route) {
        composable(AppScreens.Home.route) {

        }
    }
}