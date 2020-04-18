package com.damazo.bikes.model

class StolenBike(
    val id: Long,
    val brand: String,
    val model: String,
    val primaryImage: String,
    val year: Int,
    val color: String,
    val size: String,
    val lastView: String
): Bike(id, brand, model, year, color, size)