 package com.example.kotlin101

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

 class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView : ImageView = findViewById(R.id.imageview)
        val button : Button = findViewById(R.id.button)
        val button1: Button = findViewById(R.id.button1)

        button1 .setOnClickListener {
            imageView.setImageResource(R.drawable.off_bulb)
        }
        button.setOnClickListener {
            imageView.setImageResource(R.drawable.on_bulb)
        }
    }
}
