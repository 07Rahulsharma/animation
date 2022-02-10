package com.example.animationinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var image : ImageView
    lateinit var zoominbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image = findViewById(R.id.imageview)
        zoominbtn = findViewById(R.id.submitbtn)

        zoominbtn.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.zoomin)
            image.startAnimation(animation)
        }
    }
}