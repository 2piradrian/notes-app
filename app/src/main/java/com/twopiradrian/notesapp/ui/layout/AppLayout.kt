package com.twopiradrian.notesapp.ui.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AppLayout(
    navController: NavController,
    content: @Composable () -> Unit,
    header: @Composable (() -> Unit)? = null,
    footer: @Composable (() -> Unit)? = null,
) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        tonalElevation = 5.dp,
    ) {
        Scaffold (
            modifier = Modifier
                .fillMaxSize(),
            topBar = {
                if (header != null) {
                    header()
                }
            },
            bottomBar = {
                if (footer != null) {
                    footer()
                }
            }
        ){ innerPadding ->
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .widthIn(500.dp)
                    .padding(innerPadding)
            ) {
                content()
            }
        }
    }
}