package com.udacity.shoestore.ui.shoesList.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.udacity.shoestore.databinding.ShoeListItemBinding
import com.udacity.shoestore.domain.models.Shoe

class ShoeListAdapter(private val shoes: List<Shoe>, private val context: Context) :
    RecyclerView.Adapter<ShoeListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ShoeListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(ShoeListItemBinding.inflate(LayoutInflater.from(context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding
    }

    override fun getItemCount(): Int = shoes.size
}