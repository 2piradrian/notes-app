package com.twopiradrian.notesapp

import android.app.Application
import com.twopiradrian.notesapp.data.datasource.room.notes.implementation.RoomNotesDatabase

class NotesApp : Application() {
    private lateinit var notesDatabase: RoomNotesDatabase

    override fun onCreate() {
        super.onCreate()

        notesDatabase = RoomNotesDatabase.getDatabase(this)
    }
}