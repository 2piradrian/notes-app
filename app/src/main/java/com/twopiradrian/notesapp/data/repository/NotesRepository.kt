package com.twopiradrian.notesapp.data.repository

import com.twopiradrian.notesapp.domain.datasource.NotesDatasourceI
import com.twopiradrian.notesapp.domain.entity.Note
import com.twopiradrian.notesapp.domain.repository.NotesRepositoryI

class NotesRepository(
    private val roomDatasource: NotesDatasourceI
) : NotesRepositoryI {

    override suspend fun getAll(): List<Note> {
        return roomDatasource.getAll()
    }

    override suspend fun getById(id: String): Note {
        return roomDatasource.getById(id)
    }

    override suspend fun create(note: Note) {
        return roomDatasource.create(note)
    }

    override suspend fun update(note: Note) {
        return roomDatasource.update(note)
    }

    override suspend fun delete(note: Note) {
        return roomDatasource.delete(note)
    }

}