package com.twopiradrian.notesapp.data.datasource.room.notes.implementation

import androidx.room.Database
import androidx.room.RoomDatabase
import com.twopiradrian.notesapp.data.datasource.room.notes.RoomNotesClient

@Database(entities = [RoomNotesEntity::class], version = 1)
abstract class RoomNotesDatabase: RoomDatabase() {
    abstract fun notesClient(): RoomNotesClient
}