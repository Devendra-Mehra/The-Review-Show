package com.example.thereviewshow.homescreen.ui

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.example.base.BaseActivity
import com.example.core.di.extension.getViewModel
import com.example.core.di.utils.BaseViewModelFactory
import com.example.thereviewshow.R
import com.example.thereviewshow.di.ViewModelFactory
import com.example.thereviewshow.homescreen.viewmodle.HomeScreenViewModel
import com.example.thereviewshow.util.StringHelper
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class HomeScreenActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory)
            .get(HomeScreenViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
