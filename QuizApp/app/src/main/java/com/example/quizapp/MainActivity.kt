package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

//        val submitButton= AlertDialog.Builder(this)
//            .setTitle("HI")
//            .setMessage("Hi enkhee")
//            .setIcon(R.drawable.ic_launcher_background)
//            .setPositiveButton("Yes"){
//                dialogInterface, i ->
//                Toast.makeText(this, "Za positive", Toast.LENGTH_LONG).show()
//            }
//            .setNegativeButton("No"){
//                    dialogInterface, i ->
//                Toast.makeText(this, "Za neagtave", Toast.LENGTH_LONG).show()
//            }.create()
//
    }
}
