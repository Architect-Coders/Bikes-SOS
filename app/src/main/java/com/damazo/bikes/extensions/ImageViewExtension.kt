package com.damazo.bikes.extensions

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class MyItemViewModel{
    //Some code
    companion object {

        @JvmStatic
        @BindingAdapter("loadUrl")
        fun loadUrl(view: ImageView, url: String?) {
            url?.let {
                Glide.with(view.context)
                    .load(it)
                    .into(view)
            }
        }
    }
}
