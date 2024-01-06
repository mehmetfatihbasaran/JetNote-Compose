package com.example.jetnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.jetnoteapp.model.Converters
import com.example.jetnoteapp.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class NoteDatabase : RoomDatabase() {
    companion object {
        const val DATABASE_NAME: String = "notes_db"
    }

    abstract fun noteDao(): NoteDao
}