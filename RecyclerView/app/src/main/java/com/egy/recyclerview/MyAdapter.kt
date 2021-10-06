package com.egy.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemlist.view.*

class ListAdapter(
    var productList: ArrayList<Product>,
    val itemClickListener: com.egy.recyclerview.RecyclerView
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    interface ItemClickListener {
        fun onItemClick(position: Int)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                //TODO itemClickListener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemlist, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {
        holder.itemView.item_img.setImageResource(productList[position].image)
        holder.itemView.item_title.text = productList[position].title
        holder.itemView.item_price.text = "Price: $${productList[position].price}"
        holder.itemView.item_color.text = "Color: ${productList[position].color}"
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}