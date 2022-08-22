package com.viol4tsf.booklibrary.di

import android.content.Context
import androidx.room.Room
import com.viol4tsf.booklibrary.db.BookDatabase
import com.viol4tsf.booklibrary.other.Constants.BOOK_DB_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

//СИНГЛТОН для объявления зависимостей БД, все это существует, пока запущено приложение, затем уничтожается
@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    //построениие БД с созданием единственного экземпляра
    @Singleton
    @Provides
    fun provideBookDatabase(
        //создание контекста для создания БД, ведь по умолчанию он недоступн в модуле
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(app, BookDatabase::class.java, BOOK_DB_NAME).build()

    //предоставление объекта Dao
    @Singleton
    @Provides
    fun provideBookDao(db: BookDatabase) = db.getBookDao()
}