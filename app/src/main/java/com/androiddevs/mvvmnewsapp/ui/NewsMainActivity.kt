package com.androiddevs.mvvmnewsapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.androiddevs.mvvmnewsapp.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.news_activity_main.*

@AndroidEntryPoint
class NewsMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_activity_main)
        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}
