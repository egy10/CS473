package com.egy.wallmartstorelab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        users.add(UserInfo("egy@email.com", "hello"))
        users.add(UserInfo("bold@email.com", "yes"))
        users.add(UserInfo("don@email.com", "good"))
        users.add(UserInfo("batu@email.com", "bold"))
        users.add(UserInfo("renuka@email.com", "hi"))

    }

    var users: MutableList<UserInfo> = mutableListOf()

    fun signInImpilicit(view: android.view.View) {

        val username = findViewById<EditText>(R.id.etusername)
        val password = findViewById<EditText>(R.id.etpassword)

        var found = false
        for (user in users) {
            if (user.username.equals(username.text.toString()) && user.userpassword.equals(password.text.toString()))
                found = true
        }
        if (!found) {
            Toast.makeText(this, "Invalid user info", Toast.LENGTH_LONG).show()
            return
        }
        val intent = Intent(this, SecondActivity::class.java)
        val userInfo = UserInfo(username.text.toString(), password.text.toString())
        intent.putExtra("userinfo", userInfo)
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        val newaccount: UserInfo
        if (intent.hasExtra("newaccount")) {
            newaccount = intent.getSerializableExtra("newaccount") as UserInfo
            users.add(newaccount)
        }
    }


    fun createacc(view: android.view.View) {
        val intent = Intent(this, ThirdActivity2::class.java)
        startActivity(intent)
    }
//    forgetpass.setOnClickListener(){
//
//        var email = emailAddr.text.toString()
//        for(i in users){
//            if(email == i.username) {
//
//                var setIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"))
//                setIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
//                setIntent.putExtra(Intent.EXTRA_SUBJECT, "Recovered password:")
//                setIntent.putExtra(Intent.EXTRA_TEXT,"Password is: ${i.password}")
//                startActivity(Intent.createChooser(setIntent,"Sending via"))
//
//                return@setOnClickListener
//            }
//
//        }
//        Toast.makeText(applicationContext,"User not found", Toast.LENGTH_SHORT).show()
//    }

}