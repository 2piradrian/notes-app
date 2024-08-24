package com.twopiradrian.notesapp.ui.screen.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.twopiradrian.notesapp.ui.app.ContentType
import com.twopiradrian.notesapp.ui.app.NavigationType

@Composable
fun HomeScreen(
    navController: NavController,
    navigationType: NavigationType,
    contentType: ContentType,
    viewModel: HomeViewModel
) {
    LaunchedEffect(true) {
        viewModel.getAllNotes()
    }
    Text(text = "Home Screen")
}