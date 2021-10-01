package com.egy.wallmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun signInImpilicit(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)

        val username = findViewById<EditText>(R.id.etusername)
        val password = findViewById<EditText>(R.id.etpassword)

        val userInfo = UserInfo(username.text.toString(), password.text.toString())
        intent.putExtra("userinfo", userInfo)

        startActivity(intent)

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Sain uu",Toast.LENGTH_LONG).show()
    }

}