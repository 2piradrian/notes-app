package com.twopiradrian.notesapp.data.datasource.room.note

import com.twopiradrian.notesapp.data.mapper.NoteMapper
import com.twopiradrian.notesapp.domain.datasource.NoteDatasource
import com.twopiradrian.notesapp.domain.entity.NoteEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class NoteRoomService
@Inject constructor(private val client: Client) : NoteDatasource {

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
        return client.insert(NoteMapper.toRoomEntity(note))
    }

    override fun update(note: NoteEntity) {
        return client.update(NoteMapper.toRoomEntity(note))
    }

    override fun deleteNote(id: String) {
        return client.delete(id)
    }

}