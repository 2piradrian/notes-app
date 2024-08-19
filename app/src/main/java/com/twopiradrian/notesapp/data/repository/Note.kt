package com.twopiradrian.notesapp.data.repository

import com.twopiradrian.notesapp.data.datasource.room.note.NoteRoomService
import com.twopiradrian.notesapp.domain.datasource.NoteDatasource
import com.twopiradrian.notesapp.domain.entity.NoteEntity
import com.twopiradrian.notesapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepository : NoteRepository {

    private val roomService: NoteDatasource = NoteRoomService()

    override fun getAll(): Flow<List<NoteEntity>> {
        return roomService.getAll()
    }

    override fun getById(id: String): Flow<NoteEntity> {
        return roomService.getById(id)
    }

    override fun create(note: NoteEntity) {
        return roomService.create(note)
    }

    override fun update(note: NoteEntity) {
        return roomService.update(note)
    }

    override fun deleteNote(id: String) {
        return roomService.deleteNote(id)
    }

}