package com.twopiradrian.notesapp.domain.datasource

import com.twopiradrian.notesapp.domain.entity.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteDatasource {
    fun getAll() : Flow<List<NoteEntity>>
    fun getById(id: String) : Flow<NoteEntity>
    fun create(note: NoteEntity)
    fun update(note: NoteEntity)
    fun deleteNote(id: String)
}