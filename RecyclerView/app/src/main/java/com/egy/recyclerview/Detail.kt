package com.egy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val product = intent.getSerializableExtra("product") as Product

        Image.setImageResource(product.image)
        product_title.text = product.title
        product_color.text = "Color: ${product.color}"
        product_id.text = "Walmart product id: ${product.itemId}"
        product_desc.text = "Item description: ${product.desc}"
    }
}