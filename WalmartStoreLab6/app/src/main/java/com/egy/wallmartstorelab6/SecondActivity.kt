package com.egy.wallmartstorelab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userInfo : UserInfo
        userInfo = intent.getSerializableExtra("userinfo") as UserInfo

        val textViewUserName = findViewById<TextView>(R.id.username)
        textViewUserName.text ="Welcome"+ " " +  userInfo.username

//
    }

    fun click(view: android.view.View) {
        when (view?.id){
            R.id.beauty-> Toast.makeText(this, "You have chosen the Beauty category of shopping", Toast.LENGTH_SHORT).show()
            R.id.clothing -> Toast.makeText(this, "You have chosen the Clothing category of shopping", Toast.LENGTH_SHORT).show()
            R.id.food-> Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_SHORT).show()
            R.id.electronic ->Toast.makeText(this, "You have chosen the Electronic category of shopping", Toast.LENGTH_SHORT).show()
        }


    }


}