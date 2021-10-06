package com.egy.recyclerview


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity(), ListAdapter.ItemClickListener {
    private val products = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        supportActionBar?.title = "Category "

        products.add(
            Product(
                "Apple MacBook Pro with Apple M1 Chip",
                1300.00,
                "Gray and Rose",
                R.drawable.laptop,
                "#326285",
                "The Apple M1 chip redefines the 13-inch MacBook Pro. Featuring an 8-core CPU that flies through complex workflows in photography, coding, video editing, and more. Incredible 8-core GPU that crushes graphics-intensive tasks and enables super-smooth gaming. An advanced 16-core Neural Engine for more machine learning power in your favorite apps. Superfast unified memory for fluid performance. And the longest-ever battery life in a Mac at up to 20 hours. It?s Apple's most popular pro notebook. Way more performance and way more pro."
            )
        )
        products.add(
            Product(
                "Hamilton Beach 7 Speed Silver Stand Mixer",
                109.99,
                "Silver",
                R.drawable.mixer,
                "#578438",
                "Built for a variety of batters and mixes, the Hamilton Beach 7-Speed Stand Mixer can do everything from whipping delicate meringues to mixing sticky bread dough. Its powerful 300-watt motor can handle the thickest of ingredients, including those peanut butter chocolate chip cookies your family devours. "
            )
        )
        products.add(
            Product(
                "iPhone 13 mini 128GB Blue",
                1200.00,
                "Blue",
                R.drawable.phone,
                "#975643",
                "iPhone 13 mini. The most advanced dual-camera system ever on iPhone. Lightning-fast A15 Bionic chip. A leap in battery life. Durable design. Superfast 5G.  1 And a brighter Super Retina XDR display. "
            )
        )
        products.add(
            Product(
                "Class 4K UHD (2160P) LED Roku Smart TV",
                598.00,
                "Black",
                R.drawable.tv,
                "#1753965",
                "Enhance your entertainment experience with the onn. 70 4K Ultra High Definition Roku Smart TV. Enjoy your favorite shows and movies in stunning clarity with vivid colors, sharper images, and incredible detail. Experience fast and simple cross-channel search makes it easy to stream the 500,000+ movies and TV episodes through thousands of free or paid channels available on your onn. Roku TV. "
            )
        )
        products.add(
            Product(
                "All-in-One Wireless Color Inkjet Printer ",
                99.00,
                "White",
                R.drawable.printer,
                "#739571",
                "The HP DeskJet 4152e is ideal for home printing of 1-3 users and gives you all the essential features you need—easily print, scan, and copy. It also offers HP+: the smart printing system that keeps you more secure, more productive, and more sustainable than ever."
            )
        )

        recyclerView1.layoutManager = LinearLayoutManager(this)
        val adapter = ListAdapter(products, this)
        recyclerView1.adapter = adapter
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(applicationContext, Detail::class.java)
        intent.putExtra("product", products[position])
        startActivity(intent)
    }
}