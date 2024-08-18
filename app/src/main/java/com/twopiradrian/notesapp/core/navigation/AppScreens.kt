package com.twopiradrian.notesapp.core.navigation

sealed class AppScreens(val route: String) {
    data object Home : AppScreens("home")
}