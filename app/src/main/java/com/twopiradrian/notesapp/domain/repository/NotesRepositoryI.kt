package com.twopiradrian.notesapp.domain.repository

import com.twopiradrian.notesapp.domain.entity.Note

interface NotesRepositoryI {
    suspend fun getAll() : List<Note>
    suspend fun getById(id: String) : Note
    suspend fun create(note: Note)
    suspend fun update(note: Note)
    suspend fun delete(note: Note)
}