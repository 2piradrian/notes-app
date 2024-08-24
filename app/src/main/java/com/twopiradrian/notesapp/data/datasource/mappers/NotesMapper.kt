package com.twopiradrian.notesapp.data.datasource.mappers

import com.twopiradrian.notesapp.data.datasource.room.notes.implementation.RoomNoteEntity
import com.twopiradrian.notesapp.domain.entity.Note

object NotesMapper {
    fun toEntity(roomEntity: RoomNoteEntity): Note {
        return Note(
            id = roomEntity.id,
            title = roomEntity.title,
            content = roomEntity.content,
            timestamp = roomEntity.timestamp
        )
    }

    fun toRoomEntity(entity: Note): RoomNoteEntity {
        return RoomNoteEntity(
            id = entity.id,
            title = entity.title,
            content = entity.content,
            timestamp = entity.timestamp
        )
    }

}