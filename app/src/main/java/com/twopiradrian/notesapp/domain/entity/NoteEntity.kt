package com.twopiradrian.notesapp.domain.entity

data class NoteEntity(
    val id: String,
    val title: String,
    val content: String,
    val date: Long
)