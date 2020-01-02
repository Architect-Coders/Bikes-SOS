package com.damazo.bikes.ui.confiscated

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.damazo.bikes.R

class ConfiscatedFragment : Fragment() {

    private lateinit var confiscatedViewModel: ConfiscatedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        confiscatedViewModel =
            ViewModelProviders.of(this).get(ConfiscatedViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_confiscated, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        confiscatedViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}