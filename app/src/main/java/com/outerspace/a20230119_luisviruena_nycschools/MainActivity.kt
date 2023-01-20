package com.outerspace.a20230119_luisviruena_nycschools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.outerspace.a20230119_luisviruena_nycschools.content.ContentApi
import com.outerspace.a20230119_luisviruena_nycschools.content.ContentViewModel
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentViewModel: ContentViewModel by viewModels()

        lifecycleScope.launch {
            val mainListing = ContentApi.getMainListing()
            contentViewModel.mutableMainListing.value = mainListing
        }
    }
}