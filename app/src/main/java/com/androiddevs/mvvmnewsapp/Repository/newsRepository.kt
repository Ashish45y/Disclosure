package com.androiddevs.mvvmnewsapp.Repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class newsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}