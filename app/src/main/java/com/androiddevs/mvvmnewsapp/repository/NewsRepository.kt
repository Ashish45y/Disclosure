package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.NewsApi


import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val api: NewsApi
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int)=
        api.getBreakingNews(countryCode, pageNumber)
}