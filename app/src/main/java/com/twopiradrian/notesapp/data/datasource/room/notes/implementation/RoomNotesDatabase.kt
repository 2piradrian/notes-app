package com.twopiradrian.notesapp.data.datasource.room.notes.implementation

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.twopiradrian.notesapp.data.datasource.room.notes.RoomNotesClient

@Database(entities = [RoomNoteEntity::class], version = 1)
abstract class RoomNotesDatabase: RoomDatabase() {
    abstract fun notesClient(): RoomNotesClient

    companion object {
        private const val DATABASE_NAME = "notes_database"

        @Volatile
        private var Instance: RoomNotesDatabase? = null

        fun getDatabase(context: Context): RoomNotesDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, RoomNotesDatabase::class.java, DATABASE_NAME)
                    .build()
                    .also { Instance = it }
            }
        }
    }
}