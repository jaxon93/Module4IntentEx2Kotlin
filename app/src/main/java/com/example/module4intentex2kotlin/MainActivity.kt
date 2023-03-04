package com.example.module4intentex2kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.module4intentex2kotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();
    }

    fun initView() {
        var b_openSecond = findViewById<Button>(R.id.b_openSecond)
        var user = User("Jakhongir", 20)
        b_openSecond.setOnClickListener() {
            openSecondActivity(user)
        }
    }

    fun openSecondActivity(user: User) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}