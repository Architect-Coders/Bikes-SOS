package com.damazo.bikes.extensions

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


inline fun <reified T : AppCompatActivity> Context.launchActivity(body: Intent.() -> Unit) {
    val intent = Intent(this, T::class.java).apply(body)
    startActivity(intent)
}