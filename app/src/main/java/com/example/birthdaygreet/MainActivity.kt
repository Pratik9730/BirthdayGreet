package com.example.birthdaygreet

import android.content.Intent
import android.graphics.Color.parseColor
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
       /* Toast.makeText(this, "Entered text was $name", Toast.LENGTH_LONG).show()   used to get input from textbox and show in toast*/

        val intent /*way to go from one process to other*/= Intent(this,BirthdatGreetingActivity::class.java)
        intent.putExtra(BirthdatGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)/*inherited from main activity*/

    }
}

