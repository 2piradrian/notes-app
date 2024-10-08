package com.twopiradrian.notesapp.data.datasource.room.notes

import com.twopiradrian.notesapp.data.datasource.mappers.NotesMapper
import com.twopiradrian.notesapp.domain.datasource.NotesDatasourceI
import com.twopiradrian.notesapp.domain.entity.Note
import com.twopiradrian.notesapp.domain.usecases.notes.definition.GetAllNotes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RoomNotesDatasource(
    private val client: RoomNotesClient
) : NotesDatasourceI {

    override suspend fun getAll(): GetAllNotes.Response {
        return withContext(Dispatchers.IO) {
            if (client.getAll().isEmpty()) {
                GetAllNotes.Response(notes = emptyList())
            }
            GetAllNotes.Response(notes = client.getAll().map { NotesMapper.toEntity(it) })
        }
    }

    override suspend fun getById(id: String): Note {
        return withContext(Dispatchers.IO) {
            NotesMapper.toEntity(client.getById(id))
        }
    }

    override suspend fun create(note: Note) {
        return withContext(Dispatchers.IO) {
            client.create(NotesMapper.toRoomEntity(note))
        }
    }

    override suspend fun update(note: Note) {
        return withContext(Dispatchers.IO) {
            client.update(NotesMapper.toRoomEntity(note))
        }
    }

    override suspend fun delete(note: Note) {
        return withContext(Dispatchers.IO) {
            client.delete(NotesMapper.toRoomEntity(note))
        }
    }

}