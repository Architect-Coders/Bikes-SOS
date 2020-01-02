package com.damazo.bikes.ui.stolen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.damazo.bikes.R

class StolenFragment : Fragment() {

    private lateinit var stolenViewModel: StolenViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        stolenViewModel =
            ViewModelProviders.of(this).get(StolenViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_stolen, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        stolenViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}