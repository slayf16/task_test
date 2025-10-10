package com.example.feature.notes.domain.usecase

import com.example.feature.notes.domain.NotesRepository

class DeleteNoteUseCase(
    private val repository: NotesRepository
) {
    operator fun invoke(idNote: Long) = repository.removeNotes(idNote)
}