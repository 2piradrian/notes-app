package com.twopiradrian.notesapp.data.datasource.room.notes.implementation

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class RoomNotesEntity(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val title: String,
    val content: String,
    val date: Date,
)
