package com.twopiradrian.notesapp.domain.usecases.notes

import android.content.Context
import com.twopiradrian.notesapp.data.datasource.room.notes.RoomNotesDatasource
import com.twopiradrian.notesapp.data.datasource.room.notes.implementation.RoomNotesDatabase
import com.twopiradrian.notesapp.data.repository.NotesRepository
import com.twopiradrian.notesapp.domain.usecases.notes.implementation.GetAllNotes

class NotesUseCases(
    val getAllNotes: GetAllNotes
) {
    companion object {
        fun create(context: Context): NotesUseCases {

            val notesRepository = NotesRepository(
                roomDatasource = RoomNotesDatasource(RoomNotesDatabase.getDatabase(context).notesClient())
            )

            return NotesUseCases(
                getAllNotes = GetAllNotes(notesRepository)
            )
        }
    }

}
