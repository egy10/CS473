package com.egy.wallmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class ThirdActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third2)

    }
    fun createImplicit(view: android.view.View) {
        val firsname = findViewById<EditText>(R.id.edfirsname).text.toString()
        val lastname = findViewById<EditText>(R.id.etlastname).text.toString()
        val email = findViewById<EditText>(R.id.etemailadd).text.toString()
        val pass = findViewById<EditText>(R.id.etpassword).text.toString()


        //TODO validate email and pass

        if (email.isEmpty()||pass.isEmpty() || firsname.isEmpty() || lastname.isEmpty()){
            Toast.makeText(applicationContext, "Please enter your information ", Toast.LENGTH_SHORT).show()
            return
        }

        var userInfo : UserInfo = UserInfo(email, pass)


        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("newaccount", userInfo)

        startActivity(intent)

        Toast.makeText(this, "New account created successfully!", Toast.LENGTH_LONG).show()


    }

}