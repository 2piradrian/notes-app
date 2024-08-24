package com.twopiradrian.notesapp.domain.datasource

import com.twopiradrian.notesapp.domain.entity.Note

interface NotesDatasourceI {
    suspend fun getAll(): List<Note>
    suspend fun getById(id: String): Note
    suspend fun create(note: Note)
    suspend fun update(note: Note)
    suspend fun delete(note: Note)
}