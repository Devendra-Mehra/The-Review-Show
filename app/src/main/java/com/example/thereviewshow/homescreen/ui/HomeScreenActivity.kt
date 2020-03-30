package com.example.thereviewshow.homescreen.ui

import android.os.Bundle
import android.util.Log
import com.example.base.BaseActivity
import com.example.thereviewshow.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class HomeScreenActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
