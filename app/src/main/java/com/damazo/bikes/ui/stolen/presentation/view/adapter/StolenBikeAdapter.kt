package com.damazo.bikes.ui.stolen.presentation.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.damazo.bikes.databinding.ItemStolenBinding
import com.damazo.bikes.model.StolenBike


class StolenBikeAdapter(
    private val bikes: List<StolenBike>
) : RecyclerView.Adapter<StolenBikeAdapter.StolenViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StolenViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: ItemStolenBinding =
            ItemStolenBinding.inflate(layoutInflater, parent, false)
        return StolenViewHolder(itemBinding)

    }

    override fun getItemCount() = bikes.size

    override fun onBindViewHolder(holder: StolenViewHolder, position: Int) {
        holder.bind(bikes[position])
    }

    inner class StolenViewHolder(itemBinding: ItemStolenBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        private val itemvBinding = itemBinding

        fun bind(bike: StolenBike) {
            itemvBinding.stolenBike = bike
            itemvBinding.executePendingBindings()
        }

    }
}