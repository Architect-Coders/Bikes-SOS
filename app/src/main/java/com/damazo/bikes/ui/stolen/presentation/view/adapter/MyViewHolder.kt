package com.damazo.bikes.ui.stolen.presentation.view.adapter

import androidx.databinding.ViewDataBinding

import androidx.recyclerview.widget.RecyclerView
import com.damazo.bikes.BR


class MyViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(obj: Any?) {
        binding.setVariable(BR.obj, obj)
        binding.executePendingBindings()
    }

}