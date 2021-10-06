package com.egy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.secondpage.*

class ProductDetails(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondpage)

        val currentProduct = intent.getSerializableExtra("PRODUCT") as Product

        supportActionBar?.title = currentProduct.title
        Image.setImageResource(currentProduct.image)
        product_title.text = currentProduct.title
        product_color.text = "Color: ${currentProduct.color}"
        product_id.text = "Walmart product id: ${currentProduct.itemId}"
        product_desc.text = "Item description: ${currentProduct.desc}"
    }
}