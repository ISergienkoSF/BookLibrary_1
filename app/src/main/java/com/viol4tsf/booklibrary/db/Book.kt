package com.viol4tsf.booklibrary.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books_table")
data class Book(
    var img: Bitmap? = null,
    var timestamp: Long = 0L,
    var bookTitle: String = "",
    var bookAuthor: String = "",
    var bookSeries: String = "",
    var totalPages: Int = 0,
    var readPages: Int = 0,
    var evaluation: Int = 0,
    var progress: String = ""
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}