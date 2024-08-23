package com.twopiradrian.notesapp.data.datasource.room.notes

import com.twopiradrian.notesapp.data.datasource.mappers.NotesMapper
import com.twopiradrian.notesapp.domain.datasource.NotesDatasourceI
import com.twopiradrian.notesapp.domain.entity.NotesEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RoomNotesDatasource (
    private val datasource: RoomNotesClient
) : NotesDatasourceI {

    override fun getAll(): Flow<List<NotesEntity>> {
        return datasource.getAll().map { note -> note.map { NotesMapper.toEntity(it) } }
    }

    override fun getById(id: String): Flow<NotesEntity> {
        return datasource.getById(id).map { NotesMapper.toEntity(it) }
    }

    override fun create(note: NotesEntity) {
        return datasource.create(NotesMapper.toRoomEntity(note))
    }

    override fun update(note: NotesEntity) {
        return datasource.update(NotesMapper.toRoomEntity(note))
    }

    override fun delete(note: NotesEntity) {
        return datasource.delete(NotesMapper.toRoomEntity(note))
    }
}