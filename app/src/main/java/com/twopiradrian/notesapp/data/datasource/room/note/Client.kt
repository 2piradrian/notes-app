package com.twopiradrian.notesapp.data.datasource.room.note

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.twopiradrian.notesapp.data.datasource.room.note.config.NoteRoomEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface Client {

    @Query("SELECT * FROM notes ORDER BY date DESC")
    fun getAll(): Flow<List<NoteRoomEntity>>

    @Query("SELECT * FROM notes WHERE id = :id")
    fun getNoteById(id: String): Flow<NoteRoomEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: NoteRoomEntity)

    @Update
    fun update(note: NoteRoomEntity)

    @Query("DELETE FROM notes WHERE id = :id")
    fun delete(id: String)

}