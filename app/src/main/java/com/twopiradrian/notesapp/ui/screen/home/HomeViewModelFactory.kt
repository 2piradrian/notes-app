package com.twopiradrian.notesapp.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.twopiradrian.notesapp.domain.usecases.UseCases

class HomeViewModelFactory(
    private val useCases: UseCases
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                HomeViewModel(useCases) as T
            }
            else -> throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}
