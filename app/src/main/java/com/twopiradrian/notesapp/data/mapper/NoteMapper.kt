package com.twopiradrian.notesapp.data.mapper

import com.twopiradrian.notesapp.data.room.entity.NoteRoomEntity
import com.twopiradrian.notesapp.domain.entity.NoteEntity

object NoteMapper {
    fun toEntity(roomEntity: NoteRoomEntity): NoteEntity {
        return NoteEntity(
            id = roomEntity.id,
            title = roomEntity.title,
            content = roomEntity.content,
            date = roomEntity.date
        )
    }

    fun toRoomEntity(noteEntity: NoteEntity): NoteRoomEntity {
        return NoteRoomEntity(
            id = noteEntity.id,
            title = noteEntity.title,
            content = noteEntity.content,
            date = noteEntity.date
        )
    }
}