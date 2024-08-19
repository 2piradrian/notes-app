package com.twopiradrian.notesapp.infrastructure.datasource

import com.twopiradrian.notesapp.NotesApp
import com.twopiradrian.notesapp.data.mapper.NoteMapper
import com.twopiradrian.notesapp.domain.datasource.NoteDatasource
import com.twopiradrian.notesapp.domain.entity.NoteEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RoomNoteDatasourceI : NoteDatasource {

    private val noteDao = NotesApp().noteDatabase.noteDao()

    override fun getAll(): Flow<List<NoteEntity>> {
        return noteDao.getAll().map { notes ->
            notes.map { NoteMapper.toEntity(it) }
        }
    }

    override fun getById(id: String): Flow<NoteEntity> {
        return noteDao.getNoteById(id).map { note ->
            NoteMapper.toEntity(note)
        }
    }

    override fun create(note: NoteEntity) {
        noteDao.insert(NoteMapper.toRoomEntity(note))
    }

    override fun update(note: NoteEntity) {
        noteDao.update(NoteMapper.toRoomEntity(note))
    }

    override fun deleteNote(id: String) {
        noteDao.delete(id)
    }

}