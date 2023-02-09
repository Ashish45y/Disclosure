package com.androiddevs.mvvmnewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.Repository.newsRepository
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import kotlinx.android.synthetic.main.news_activity_main.*

class NewsMainActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContentView(R.layout.news_activity_main)
        val newsRepository = newsRepository(ArticleDatabase.getInstance(this))
        val viewModelProviderFactory = newsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory)[(NewsViewModel::class.java)]



        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}
