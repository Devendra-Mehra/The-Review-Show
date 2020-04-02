package com.example.thereviewshow.trending.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.base.BaseActivity
import com.example.thereviewshow.R
import com.example.thereviewshow.di.ViewModelFactory
import com.example.thereviewshow.trending.viewmodle.TrendingViewModel
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


    }
}
