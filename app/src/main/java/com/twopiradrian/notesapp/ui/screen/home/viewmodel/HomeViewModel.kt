package com.twopiradrian.notesapp.ui.screen.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.twopiradrian.notesapp.domain.usecases.UseCases
import kotlinx.coroutines.launch

class HomeViewModel(
    private val useCases: UseCases
) : ViewModel() {

    fun getAllNotes() {
        viewModelScope.launch {
            useCases.notesUseCases.getAllNotes()
        }
    }

}