package com.egy.tablayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.setPadding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add = findViewById<Button>(R.id.add)
        val table = findViewById<TableLayout>(R.id.table)
        val txt1 = findViewById<TextView>(R.id.column1)
        val txt2 = findViewById<TextView>(R.id.column2)

        add.setOnClickListener {

            val tableRow = TableRow(applicationContext)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams
            val columnOne = TextView(this)
            columnOne.text = txt1.text
            columnOne.setPadding(10)
            columnOne.setBackgroundColor(Color.parseColor("#f368e0"))

            val columnTwo = TextView(this)
            columnTwo.text = txt2.text
            columnTwo.setPadding(10)
            columnTwo.setBackgroundColor(Color.parseColor("#f368e0"))

            tableRow.addView(columnOne)
            tableRow.addView(columnTwo)
            tableRow.setPadding(0, 0, 0, 10)

            table.addView(tableRow)

            Toast.makeText(applicationContext, "Success", Toast.LENGTH_LONG).show()
        }
    }
}