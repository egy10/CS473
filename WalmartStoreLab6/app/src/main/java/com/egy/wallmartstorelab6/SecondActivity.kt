package com.egy.wallmartstorelab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
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

    }

    fun click(view: android.view.View) {
        when (view?.id){
            R.id.beauty-> {
                val intent = Intent(applicationContext, ListviewActivity::class.java)
                intent.putExtra("category", "beauty")
                startActivity(intent)
            }
            R.id.clothing -> {
                val intent = Intent(applicationContext, ListviewActivity::class.java)
                intent.putExtra("category", "clothing")
                startActivity(intent)
            }
            R.id.food-> {
                val intent = Intent(applicationContext, ListviewActivity::class.java)
                intent.putExtra("category", "food")
                startActivity(intent)
            }
            R.id.electronic -> {
                val intent = Intent(applicationContext, ListviewActivity::class.java)
                intent.putExtra("category", "electronic")
                startActivity(intent)
            }
        }


    }






}