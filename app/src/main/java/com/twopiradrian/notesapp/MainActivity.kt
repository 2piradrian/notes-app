@file:OptIn(ExperimentalMaterial3WindowSizeClassApi::class)

package com.twopiradrian.notesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.twopiradrian.notesapp.core.navigation.AppNavigation
import com.twopiradrian.notesapp.ui.app.ContentType
import com.twopiradrian.notesapp.ui.app.NavigationType
import com.twopiradrian.notesapp.ui.theme.NotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotesAppTheme {
                val windowSize = calculateWindowSizeClass(this)

                val navigationType: NavigationType
                val contentType: ContentType

                when(windowSize.widthSizeClass){
                    WindowWidthSizeClass.Compact -> {
                        navigationType = NavigationType.BOTTOM_NAVIGATION
                        contentType = ContentType.LIST_ONLY
                    }
                    WindowWidthSizeClass.Medium -> {
                        navigationType = NavigationType.NAVIGATION_RAIL
                        contentType = ContentType.LIST_ONLY
                    }
                    WindowWidthSizeClass.Expanded -> {
                        navigationType = NavigationType.PERMANENT_NAVIGATION_DRAWER
                        contentType = ContentType.LIST_WITH_DETAILS
                    }
                    else -> {
                        navigationType = NavigationType.BOTTOM_NAVIGATION
                        contentType = ContentType.LIST_ONLY
                    }
                }

                AppNavigation(navigationType = navigationType, contentType = contentType)
            }
        }
    }
}