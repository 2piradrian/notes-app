package com.twopiradrian.notesapp.domain.usecases.notes.definition

import com.twopiradrian.notesapp.R
import com.twopiradrian.notesapp.domain.entity.Note
import com.twopiradrian.notesapp.domain.repository.NotesRepositoryI

class GetAllNotes(
    private val repository: NotesRepositoryI
) {

    // data class Request()

    data class Response(
        val notes: List<Note>,
        val error: String? = null
    )

    data class Result(
        val data: Response? = null,
        val error: Int? = null,
    )

    suspend operator fun invoke(): Result {
        return try {
            val response = repository.getAll()

            if (response.error != null){
                return Result(data = null, error = 0)
            }

            Result(data = response)
        }
        catch (e: Exception) {
            e.printStackTrace()

            Result(error = R.string.error_note_list_not_found)
        }
    }
}