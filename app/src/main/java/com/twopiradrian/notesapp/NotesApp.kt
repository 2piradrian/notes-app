package com.twopiradrian.notesapp

import android.app.Application
import com.twopiradrian.notesapp.data.room.database.NoteDatabase

class NotesApp : Application() {

    val noteDatabase: NoteDatabase by lazy {
        NoteDatabase.getDatabase(this)
    }

}