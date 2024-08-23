package com.twopiradrian.notesapp.domain.repository

import com.twopiradrian.notesapp.domain.entity.NotesEntity
import kotlinx.coroutines.flow.Flow

interface NotesRepositoryI {
    fun getAll() : Flow<List<NotesEntity>>
    fun getById(id: String) : Flow<NotesEntity>
    fun create(note: NotesEntity)
    fun update(note: NotesEntity)
    fun delete(note: NotesEntity)
}