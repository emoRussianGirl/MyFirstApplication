package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }

    fun init()
    {

        var buy = findViewById<Button>(R.id.button)

        buy.setOnClickListener(){
            val intent = Intent(this, form::class.java)
            startActivity(intent);
        }
    }
}