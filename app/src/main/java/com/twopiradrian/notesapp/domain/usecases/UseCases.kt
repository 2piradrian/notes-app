package com.twopiradrian.notesapp.domain.usecases

import android.content.Context
import com.twopiradrian.notesapp.domain.usecases.notes.NotesUseCases

class UseCases(
    val notesUseCases: NotesUseCases
) {
    companion object {
        fun create(context: Context): UseCases {
            return UseCases(
                notesUseCases = NotesUseCases.create(context)
            )
        }
    }
}