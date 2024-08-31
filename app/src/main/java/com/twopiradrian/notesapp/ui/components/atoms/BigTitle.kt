package com.twopiradrian.notesapp.ui.components.atoms

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun BigTitle(
    text: String,
){
    Text(
        text = text,
        style = MaterialTheme.typography.displayLarge.copy(
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight(weight = 700)
        )
    )
}