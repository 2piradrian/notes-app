package com.twopiradrian.notesapp.domain.entity

data class Note(
    val id: Long,
    val title: String,
    val content: String,
    val timestamp: Long
)