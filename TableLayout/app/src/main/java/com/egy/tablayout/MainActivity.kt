package com.egy.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    open fun add(Version: String, Name: String){}

    fun button(view: android.view.View) {
        // Create a new table row.
        val tableRow = TableRow(getApplicationContext())
        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)}
// add values into row by calling addView()
//
//        tableRow.addView(value,column numbers)
//// Finally add the created row row into layout
//        tableLayoutid.addView(tableRow) // id from Layout_file
//    }
}