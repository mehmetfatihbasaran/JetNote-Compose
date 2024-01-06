package com.example.jetnoteapp.repository

import com.example.jetnoteapp.data.NoteDao
import com.example.jetnoteapp.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(private val dao: NoteDao) {

    fun getAllNotes(): Flow<List<Note>> {
        return dao.getAllNotes().flowOn(Dispatchers.IO)
    }

    suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    suspend fun updateNote(note: Note) {
        dao.updateNote(note)
    }

    suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    suspend fun deleteAllNotes() {
        dao.deleteAllNotes()
    }

    suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }

}