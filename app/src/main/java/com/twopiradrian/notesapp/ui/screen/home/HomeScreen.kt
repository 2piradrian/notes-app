package com.twopiradrian.notesapp.ui.screen.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.twopiradrian.notesapp.ui.app.ContentType
import com.twopiradrian.notesapp.ui.app.NavigationType
import com.twopiradrian.notesapp.ui.components.atoms.BigTitle
import com.twopiradrian.notesapp.ui.layout.AppLayout
import com.twopiradrian.notesapp.ui.screen.home.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    navController: NavController,
    navigationType: NavigationType,
    contentType: ContentType,
    viewModel: HomeViewModel
) {
    AppLayout(
        navController = navController,
        content = {
            HomeBody()
        }
    )
}

@Composable
fun HomeBody(){
    BigTitle(text = "Hola")
    Text(text = "Buenas Tardes")
}