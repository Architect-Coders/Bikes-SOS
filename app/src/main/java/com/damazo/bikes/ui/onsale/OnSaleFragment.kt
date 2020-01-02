package com.damazo.bikes.ui.onsale

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.damazo.bikes.R

class OnSaleFragment : Fragment() {

    private lateinit var onSaleViewModel: OnSaleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        onSaleViewModel =
            ViewModelProviders.of(this).get(OnSaleViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_on_sale, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        onSaleViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}