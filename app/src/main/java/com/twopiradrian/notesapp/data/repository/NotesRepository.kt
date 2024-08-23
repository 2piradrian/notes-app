package com.twopiradrian.notesapp.data.repository

import com.twopiradrian.notesapp.domain.datasource.NotesDatasourceI
import com.twopiradrian.notesapp.domain.entity.NotesEntity
import com.twopiradrian.notesapp.domain.repository.NotesRepositoryI
import kotlinx.coroutines.flow.Flow

class NotesRepository (
    private val notesDatasource: NotesDatasourceI
) : NotesRepositoryI {

    override fun getAll(): Flow<List<NotesEntity>> {
        return notesDatasource.getAll()
    }

    override fun getById(id: String): Flow<NotesEntity> {
        return notesDatasource.getById(id)
    }

    override fun create(note: NotesEntity) {
        return notesDatasource.create(note)
    }

    override fun update(note: NotesEntity) {
        return notesDatasource.update(note)
    }

    override fun delete(note: NotesEntity) {
        return notesDatasource.delete(note)
    }

}