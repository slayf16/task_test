package com.example.feature.notes.domain.usecase

import com.example.feature.notes.domain.NotesRepository
import com.example.feature.notes.domain.model.Note

class UpdateNoteUseCase (
    private val repository: NotesRepository
) {
    operator fun invoke(note: Note) = repository.updateNote(note)
}