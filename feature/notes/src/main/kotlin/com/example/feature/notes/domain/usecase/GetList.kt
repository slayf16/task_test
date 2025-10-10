package com.example.feature.notes.domain.usecase

import com.example.feature.notes.domain.NotesRepository

class GetList(
    private val repository: NotesRepository
) {
    operator fun invoke() = repository.getNotes()
}