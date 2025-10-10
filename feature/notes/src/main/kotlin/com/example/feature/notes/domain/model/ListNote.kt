package com.example.feature.notes.domain.model

data class ListNoteItem(
    val id: Long,
    val titleNotes: String
)

data class ListNotes(val content: List<ListNoteItem>)
