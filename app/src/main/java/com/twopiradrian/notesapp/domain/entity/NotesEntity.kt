package com.twopiradrian.notesapp.domain.entity

import java.util.Date

data class NotesEntity(
    val id: String,
    val title: String,
    val content: String,
    val date: Date
)