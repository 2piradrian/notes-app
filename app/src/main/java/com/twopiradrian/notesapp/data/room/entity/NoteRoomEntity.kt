package com.twopiradrian.notesapp.data.room.entity

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