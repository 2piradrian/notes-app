package com.twopiradrian.notesapp.domain.usecases.notes.implementation

import com.twopiradrian.notesapp.domain.entity.Note
import com.twopiradrian.notesapp.domain.repository.NotesRepositoryI

class GetAllNotes(
    private val repository: NotesRepositoryI
) {

    // data class Request()

    data class Response(
        val notes: List<Note>
    )

    data class Result(
        val error: Int? = null,
        val data: Response? = null
    )

    suspend operator fun invoke(): Result {
        return try {
            val response = repository.getAll()

            Result(data = Response(notes = response))
        }
        catch (e: Exception) {
            e.printStackTrace()

            Result(error = 1) // TODO: Define error codes on strings.xml

        }
    }
}