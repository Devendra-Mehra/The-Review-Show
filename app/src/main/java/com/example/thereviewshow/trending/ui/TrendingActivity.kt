package com.example.thereviewshow.trending.ui

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.example.base.BaseActivity
import com.example.core.di.utils.MediaTime
import com.example.core.di.utils.MediaType
import com.example.thereviewshow.R
import com.example.thereviewshow.di.ViewModelFactory
import com.example.thereviewshow.trending.viewmodel.TrendingViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class TrendingActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory)
            .get(TrendingViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            Log.d("Log24", "clicked");
            viewModel.getTrending(MediaType.tv, MediaTime.day)
        }


    }
}
