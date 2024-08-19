package com.twopiradrian.notesapp.core.module

import android.content.Context
import androidx.room.Room
import com.twopiradrian.notesapp.data.datasource.room.note.Client
import com.twopiradrian.notesapp.data.datasource.room.note.config.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteDatabaseModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDatabase {
        return Room.databaseBuilder(context, NoteDatabase::class.java, "notes_database")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideNoteClient(database: NoteDatabase): Client {
        return database.client()
    }
}
