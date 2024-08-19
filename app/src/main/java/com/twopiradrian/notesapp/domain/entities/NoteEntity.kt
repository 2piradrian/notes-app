package com.twopiradrian.notesapp.domain.entities

interface NoteModel {
    val id: String
    val title: String
    val content: String
    val date: Long
}

data class NoteEntity(
    val id: String,
    val title: String,
    val content: String,
    val date: Long
)