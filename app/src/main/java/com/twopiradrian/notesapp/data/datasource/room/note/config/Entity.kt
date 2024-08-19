package com.twopiradrian.notesapp.data.datasource.room.note.config

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes", primaryKeys = ["id"])
data class NoteRoomEntity(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val title: String,
    val content: String,
    val date: Long
)