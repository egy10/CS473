package com.egy.wallmartstorelab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView
import android.widget.Toast;
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {

    private lateinit var  strings : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val category = intent.getStringExtra("category")
        strings = when (category) {
            "beauty" -> arrayOf("Mirror","Eye Shadow","Lipsticks","Blush","Primer","Face cream","Moisturiser","Cleanser","Bronzer","Foundation")
            "clothing" -> arrayOf("Dress","Sweater","T-shirt","Panties","Bra","Gym Clothes","Hoodie","Pants","Jeans Skirt","Tank top")
            "food" -> arrayOf("Cheese","Egg","Butter","Yogurt","Cabbage","Pizza","Bread","Bacon","Salad","Milk")
            "electronic" -> arrayOf("Calculator","Refrigerator","Scanner","Speaker","Electric guitar","Toaster","Television","Smartphone","Rice cooker","Piano")
            else -> arrayOf("Cheese","Egg","Butter","Yogurt","Cabbage","Pizza","Bread","Bacon","Salad","Milk")
        }

        val adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, strings)
        listview.setAdapter(adapter)
        listview.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(this,"Item selected is " + parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show()
            }

    }
}
