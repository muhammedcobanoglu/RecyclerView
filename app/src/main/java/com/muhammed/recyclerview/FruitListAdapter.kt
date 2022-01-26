package com.muhammed.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.muhammed.recyclerview.data.Fruit

/**
 * Created by Muhammed COBANOGLU on 26.01.2022.
 */
class FruitListAdapter(private val dataSet: List<Fruit>) : RecyclerView.Adapter<FruitListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fruitImage : ImageView = view.findViewById(R.id.fruit_image)
        val fruitName : TextView = view.findViewById(R.id.fruit_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fruit, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fruitName.text = dataSet[position].fruitName
        holder.fruitImage.setImageResource(dataSet[position].fruitImage)
    }

    override fun getItemCount(): Int = dataSet.size
}