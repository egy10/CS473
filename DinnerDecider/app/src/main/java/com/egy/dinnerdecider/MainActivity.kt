package com.egy.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var foods = ArrayList<String>(
        arrayListOf(
            "Hamburger", "Pizza",
            "Mexican", "American", "Chinese"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun change(view: android.view.View) {
        var decidedFood = findViewById<TextView>(R.id.textView)
        decidedFood.text = foods.random()

    }

    fun addFood(view: android.view.View) {
        var putName = findViewById<TextView>(R.id.edittext)
        foods.add(putName.text.toString())

    }

}