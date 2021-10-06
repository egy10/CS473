package com.example.quizapp

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    var point = 0
    val date = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
    val currentDate = date.format(Date())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkQuiz(view: View) {
        point = 0
        val radioOne = findViewById<RadioButton>(R.id.radio_one)
        if( radioOne.isChecked()){
            point += 50
        }

        val checkTwo = findViewById<CheckBox>(R.id.check_two)
        if(checkTwo.isChecked){
            point += 25
        }

        val checkFour = findViewById<CheckBox>(R.id.check_four)
        if(checkFour.isChecked){
            point += 25
        }

        val alertDialog = AlertDialog.Builder(this@MainActivity).create()
        alertDialog.setTitle("Result")
        alertDialog.setMessage(
            "Total score: " +point + " "
                    +"Submission date: " + currentDate)

            alertDialog.setButton(
            AlertDialog.BUTTON_POSITIVE, "OK"
        ) { dialog, which -> dialog.dismiss() }
        alertDialog.show()
    }

    fun resetQuiz(view: View) {
        findViewById<RadioGroup>(R.id.rg).clearCheck()
        findViewById<CheckBox>(R.id.check_one).setChecked(false)
        findViewById<CheckBox>(R.id.check_two).setChecked(false)
        findViewById<CheckBox>(R.id.check_three).setChecked(false)
        findViewById<CheckBox>(R.id.check_four).setChecked(false)
    }
}
