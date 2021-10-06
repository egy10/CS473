package com.example.recyclerlistview

import Product
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.recycleview.*

class RecyclerView : AppCompatActivity() {
    val product = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycleview)
        supportActionBar?.title = "Category"

        product.add(Product("Apple MacBook Pro with Apple M1 Chip", 1300.00, "Gray and Rose", R.drawable.laptop,))

    }

}