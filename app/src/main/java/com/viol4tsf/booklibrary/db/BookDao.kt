package com.viol4tsf.booklibrary.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)

    @Query("SELECT * FROM books_table ORDER BY timestamp DESC")
    fun getAllBooksSortedByDate(): LiveData<List<Book>>

    @Query("SELECT * FROM books_table ORDER BY bookTitle DESC")
    fun getAllBooksSortedByTitle(): LiveData<List<Book>>

    @Query("SELECT * FROM books_table ORDER BY bookAuthor DESC")
    fun getAllBooksSortedByAuthor(): LiveData<List<Book>>

    @Query("SELECT * FROM books_table ORDER BY bookSeries DESC")
    fun getAllBooksSortedBySeries(): LiveData<List<Book>>

    @Query("SELECT * FROM books_table ORDER BY totalPages DESC")
    fun getAllBooksSortedByTotalPages(): LiveData<List<Book>>

    @Query("SELECT * FROM books_table ORDER BY readPages DESC")
    fun getAllBooksSortedByReadPages(): LiveData<List<Book>>

    @Query("SELECT * FROM books_table ORDER BY evaluation DESC")
    fun getAllBooksSortedByEvaluation(): LiveData<List<Book>>

    @Query("SELECT SUM(readPages) FROM books_table")
    fun getTotalReadPages(): LiveData<Int>

    @Query("SELECT AVG(evaluation) FROM books_table")
    fun getTotalAvgEvaluation(): LiveData<Float>

    @Query("SELECT AVG(totalPages) FROM books_table")
    fun getTotalAvgTotalPages(): LiveData<Float>
}