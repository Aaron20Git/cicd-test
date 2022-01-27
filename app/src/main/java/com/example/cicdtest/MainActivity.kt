package com.example.cicdtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvTitle = findViewById<TextView>(R.id.tv_title)

        tvTitle.text = "Hello World. This is CICD Test"

        // 第一次更改
        tvTitle.text = "Hello World. This is CICD Test, First Change"
    }
}