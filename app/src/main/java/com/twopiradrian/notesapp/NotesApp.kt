package com.twopiradrian.notesapp

import android.app.Application
import com.twopiradrian.notesapp.data.datasource.room.note.config.NoteDatabase

class NotesApp : Application() {

    val noteDatabase: NoteDatabase by lazy {
        NoteDatabase.getDatabase(this)
    }

}