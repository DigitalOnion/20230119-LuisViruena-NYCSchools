package com.outerspace.a20230119_luisviruena_nycschools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.lifecycleScope
import com.outerspace.a20230119_luisviruena_nycschools.content.ContentApi
import com.outerspace.a20230119_luisviruena_nycschools.content.ContentViewModel
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.app_toolbar)
        setSupportActionBar(toolbar)

        val contentViewModel: ContentViewModel by viewModels()

        lifecycleScope.launch {
            val mainListing = ContentApi.getMainListing()
            contentViewModel.mutableMainListing.value = mainListing
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_about -> {

            AlertDialog.Builder(this)
                .setMessage(R.string.about_message)
                .setTitle(R.string.about_title)
                .create()
                .show()
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

}