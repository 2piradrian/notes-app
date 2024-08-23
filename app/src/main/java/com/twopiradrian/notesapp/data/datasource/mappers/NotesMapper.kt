package com.twopiradrian.notesapp.data.datasource.mappers

import com.twopiradrian.notesapp.data.datasource.room.notes.implementation.RoomNotesEntity
import com.twopiradrian.notesapp.domain.entity.NotesEntity

object NotesMapper {
    fun toEntity(roomEntity: RoomNotesEntity): NotesEntity {
        return NotesEntity(
            id = roomEntity.id,
            title = roomEntity.title,
            content = roomEntity.content,
            date = roomEntity.date
        )
    }

    fun toRoomEntity(entity: NotesEntity): RoomNotesEntity {
        return RoomNotesEntity(
            id = entity.id,
            title = entity.title,
            content = entity.content,
            date = entity.date
        )
    }

}