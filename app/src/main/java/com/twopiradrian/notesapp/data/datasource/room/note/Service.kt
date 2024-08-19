package com.twopiradrian.notesapp.data.datasource.room.note

import com.twopiradrian.notesapp.NotesApp
import com.twopiradrian.notesapp.data.mapper.NoteMapper
import com.twopiradrian.notesapp.domain.datasource.NoteDatasource
import com.twopiradrian.notesapp.domain.entity.NoteEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class NoteRoomService : NoteDatasource {

    private val client = NotesApp().noteDatabase.client()

    override fun getAll(): Flow<List<NoteEntity>> {
        return client.getAll().map { notes ->
            notes.map { NoteMapper.toEntity(it) }
        }
    }

    override fun getById(id: String): Flow<NoteEntity> {
        return client.getNoteById(id).map { note ->
            NoteMapper.toEntity(note)
        }
    }

    override fun create(note: NoteEntity) {
        client.insert(NoteMapper.toRoomEntity(note))
    }

    override fun update(note: NoteEntity) {
        client.update(NoteMapper.toRoomEntity(note))
    }

    override fun deleteNote(id: String) {
        client.delete(id)
    }

}