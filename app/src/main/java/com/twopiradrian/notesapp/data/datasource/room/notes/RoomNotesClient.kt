package com.twopiradrian.notesapp.data.datasource.room.notes

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.twopiradrian.notesapp.data.datasource.room.notes.implementation.RoomNotesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RoomNotesClient {

    @Query("SELECT * FROM RoomNotesEntity")
    fun getAll(): Flow<List<RoomNotesEntity>>

    @Query("SELECT * FROM RoomNotesEntity WHERE id = :id")
    fun getById(id: String): Flow<RoomNotesEntity>

    @Insert
    fun create(note: RoomNotesEntity)

    @Update
    fun update(note: RoomNotesEntity)

    @Delete
    fun delete(note: RoomNotesEntity)

}