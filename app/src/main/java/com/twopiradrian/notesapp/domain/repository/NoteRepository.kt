package com.twopiradrian.notesapp.domain.repository

import com.twopiradrian.notesapp.domain.entity.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getAll() : Flow<List<NoteEntity>>
    fun getById(id: String) : Flow<NoteEntity>
    fun create(note: NoteEntity)
    fun update(note: NoteEntity)
    fun deleteNote(id: String)
}