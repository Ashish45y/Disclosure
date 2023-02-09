package com.androiddevs.mvvmnewsapp.db

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

import com.androiddevs.mvvmnewsapp.models.Article


@Database(entities = [Article::class], version = 1)
@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {
    abstract fun getArticleDao(): ArticleDao


    companion object {
        private var INSTANCE: ArticleDatabase? = null
        fun getInstance(context: Context): ArticleDatabase {
            if (INSTANCE == null) {
                synchronized(ArticleDatabase::class) {
                    INSTANCE = buildRoomDB(context)
                }
            }
            return INSTANCE!!
        }
        private fun buildRoomDB(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "geeksforgeeks-example-coroutines"
            ).build()
    }

}