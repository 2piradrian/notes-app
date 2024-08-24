package com.twopiradrian.notesapp.domain.repository

import com.twopiradrian.notesapp.domain.entity.Note
import com.twopiradrian.notesapp.domain.usecases.notes.definition.GetAllNotes

interface NotesRepositoryI {
    suspend fun getAll(): GetAllNotes.Response
    suspend fun getById(id: String): Note
    suspend fun create(note: Note)
    suspend fun update(note: Note)
    suspend fun delete(note: Note)
}