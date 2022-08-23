package com.viol4tsf.booklibrary.repository

import com.viol4tsf.booklibrary.db.Book
import com.viol4tsf.booklibrary.db.BookDao
import javax.inject.Inject

//репозиторий нужен для сбора данныз из всех источников
class MainRepository @Inject constructor(
    val bookDao: BookDao
){
    suspend fun insertBook(book: Book) = bookDao.insertBook(book)

    suspend fun deleteBook(book: Book) = bookDao.deleteBook(book)

    fun getAllBooksSortedByDate() = bookDao.getAllBooksSortedByDate()

    fun getAllBooksSortedByTitle() = bookDao.getAllBooksSortedByTitle()

    fun getAllBooksSortedByAuthor() = bookDao.getAllBooksSortedByAuthor()

    fun getAllBooksSortedBySeries() = bookDao.getAllBooksSortedBySeries()

    fun getAllBooksSortedByTotalPages() = bookDao.getAllBooksSortedByTotalPages()

    fun getAllBooksSortedByReadPages() = bookDao.getAllBooksSortedByReadPages()

    fun getAllBooksSortedByEvaluation() = bookDao.getAllBooksSortedByEvaluation()

    fun getTotalReadPages() = bookDao.getTotalReadPages()

    fun getTotalAvgEvaluation() = bookDao.getTotalAvgEvaluation()

    fun getTotalAvgTotalPages() = bookDao.getTotalAvgTotalPages()
}