package com.egy.wallmartstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userInfo : UserInfo
        userInfo = intent.getSerializableExtra("userinfo") as UserInfo

        val textViewUserName = findViewById<TextView>(R.id.username)
        textViewUserName.text = userInfo.username

    }

}