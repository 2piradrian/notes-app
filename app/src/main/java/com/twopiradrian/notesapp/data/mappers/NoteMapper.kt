package com.twopiradrian.notesapp.data.mappers

import com.twopiradrian.notesapp.data.databases.room.entity.NoteRoomEntity
import com.twopiradrian.notesapp.domain.entities.NoteEntity
import com.twopiradrian.notesapp.domain.entities.NoteModel

object NoteMapper {
    fun <T:NoteModel>toEntity(dataObject: T): NoteEntity {
        return NoteEntity(
            id = dataObject.id,
            title = dataObject.title,
            content = dataObject.content,
            date = dataObject.date
        )
    }
    fun <T:NoteModel>toRoomEntity(dataObject: T): NoteRoomEntity {
        return NoteRoomEntity(
            id = dataObject.id,
            title = dataObject.title,
            content = dataObject.content,
            date = dataObject.date
        )
    }
}