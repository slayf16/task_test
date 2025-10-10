package com.example.feature.notes.domain

import com.example.feature.notes.domain.model.ListNotes
import com.example.feature.notes.domain.model.Note

interface NotesRepository {

    fun getNote(id: Long) : Note

    fun addNote(note: Note) : Boolean

    fun removeNote(id: Long) : Boolean

    fun updateNote(note: Note): Boolean

    fun getNotes() : ListNotes
}
