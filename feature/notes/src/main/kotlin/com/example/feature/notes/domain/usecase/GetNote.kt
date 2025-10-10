package com.example.feature.notes.domain.usecase

import com.example.feature.notes.domain.NotesRepository

class GetNote(
    private val repository: NotesRepository
) {
    operator fun invoke(idNote: Long) = repository.getNote(idNote)
}