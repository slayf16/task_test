package com.example.feature.notes.domain

/** заметка */
data class Note(
    val id: Long,
    val title: String,
    val content: List<TypeNote>
)

/** Тип заметок */
sealed interface TypeNote {
    val content: Any

    /** текстовая заметка */
    data class TextNote(override val content: String) : TypeNote

    /** заметка списком */
    data class ListTypeNote(override val content: List<ListTypeNoteItem>) : TypeNote
}

/** элемент заметки в виде списка (заметки чекбоксом) */
data class ListTypeNoteItem(
    val id: Long,
    val content: String,
    val isChecked: Boolean
)
