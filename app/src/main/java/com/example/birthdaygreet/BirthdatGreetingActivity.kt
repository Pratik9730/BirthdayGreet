package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdat_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdatGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdat_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)/*Get the input from main activity*/
        birthdayGreeting.text = "Happy Birthday $name"

    }
}