package com.toasrinkotlin

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.techno.blog.post.R

class MainActivity : AppCompatActivity() {

    internal var _button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _button = findViewById(R.id.button) as Button?

        _button?.setOnClickListener { Toast.makeText(applicationContext, "You Clicked", Toast.LENGTH_LONG).show() }


    }
}
