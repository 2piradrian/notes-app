package com.twopiradrian.notesapp.data.datasource.room.notes

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.twopiradrian.notesapp.data.datasource.room.notes.implementation.RoomNoteEntity

@Dao
interface RoomNotesClient {

    @Query("SELECT * FROM RoomNoteEntity")
    suspend fun getAll(): List<RoomNoteEntity>

    @Query("SELECT * FROM RoomNoteEntity WHERE id = :id")
    suspend fun getById(id: String): RoomNoteEntity

    @Insert
    suspend fun create(note: RoomNoteEntity)

    @Update
    suspend fun update(note: RoomNoteEntity)

    @Delete
    suspend fun delete(note: RoomNoteEntity)

}