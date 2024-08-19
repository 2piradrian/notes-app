package com.twopiradrian.notesapp.infrastructure.repository

import com.twopiradrian.notesapp.domain.datasource.NoteDatasource
import com.twopiradrian.notesapp.domain.entity.NoteEntity
import com.twopiradrian.notesapp.domain.repository.NoteRepository
import com.twopiradrian.notesapp.infrastructure.datasource.RoomNoteDatasourceI
import kotlinx.coroutines.flow.Flow

class NoteRepositoryI : NoteRepository {

    private val noteDatasource: NoteDatasource = RoomNoteDatasourceI()

    override fun getAll(): Flow<List<NoteEntity>> {
        return noteDatasource.getAll()
    }

    override fun getById(id: String): Flow<NoteEntity> {
        return noteDatasource.getById(id)
    }

    override fun create(note: NoteEntity) {
        return noteDatasource.create(note)
    }

    override fun update(note: NoteEntity) {
        return noteDatasource.update(note)
    }

    override fun deleteNote(id: String) {
        return noteDatasource.deleteNote(id)
    }

}