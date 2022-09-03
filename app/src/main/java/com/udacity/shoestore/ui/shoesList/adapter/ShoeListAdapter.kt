//package com.udacity.shoestore.ui.shoesList.adapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import coil.load
//import coil.transform.CircleCropTransformation
//import com.udacity.shoestore.R
//import com.udacity.shoestore.databinding.ShoeListItemBinding
//import com.udacity.shoestore.domain.models.Shoe
//
//class ShoeListAdapter(private val shoes: List<Shoe>, private val context: Context) :
//    RecyclerView.Adapter<ShoeListAdapter.ViewHolder>() {
//
//    class ViewHolder(val binding: ShoeListItemBinding) : RecyclerView.ViewHolder(binding.root)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
//        ViewHolder(ShoeListItemBinding.inflate(LayoutInflater.from(context), parent, false))
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val shoe = shoes[position]
//
//        holder.binding.tvName.text = shoe.name
//        holder.binding.tvSize.text = shoe.size.toString()
//        holder.binding.tvCompany.text = shoe.company
//        holder.binding.tvDescription.text = shoe.description
//        holder.binding.ivShoe.load(
//            shoe.images[0]
//        ) {
//            crossfade(true)
//            placeholder(R.drawable.ic_baseline_error_24)
//            transformations(CircleCropTransformation())
//            error(R.drawable.ic_baseline_error_24)
//        }
//    }
//
//    override fun getItemCount(): Int = shoes.size
//}