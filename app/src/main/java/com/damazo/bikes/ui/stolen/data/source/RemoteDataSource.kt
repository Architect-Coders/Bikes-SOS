package com.damazo.bikes.ui.stolen.data.source

import com.damazo.bikes.model.StolenBike

interface RemoteDataSource {
    suspend fun getStolenBikes(region: String): List<StolenBike>
    suspend fun getStolenBike(id: Long): StolenBike
}