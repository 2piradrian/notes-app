package com.twopiradrian.notesapp.domain.datasource

import com.twopiradrian.notesapp.domain.entity.NotesEntity
import kotlinx.coroutines.flow.Flow

interface NotesDatasourceI {
    fun getAll() : Flow<List<NotesEntity>>
    fun getById(id: String) : Flow<NotesEntity>
    fun create(note: NotesEntity)
    fun update(note: NotesEntity)
    fun delete(note: NotesEntity)
}