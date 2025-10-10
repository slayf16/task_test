package com.example.feature.notes.domain

data class ListNoteItem(
    val id: Long,
    val titleNotes: String
)

data class ListNotes(val content: List<ListNoteItem>)
