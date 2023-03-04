package com.example.module4intentex2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    fun initView() {
        var tv_second = findViewById<TextView>(R.id.tv_second)
        var user = intent.getSerializableExtra("user")

        tv_second.text = user.toString()
    }
}