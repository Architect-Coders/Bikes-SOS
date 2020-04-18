package com.damazo.bikes.ui.stolen.data.repository

import com.damazo.bikes.model.StolenBike
import com.damazo.bikes.ui.stolen.data.source.RemoteDataSource

class StolenRepository(
    private val remoteDataSource: RemoteDataSource
) {

    suspend fun getStolenBikes(region: String): List<StolenBike> {
        return remoteDataSource.getStolenBikes(region)
    }

    suspend fun getStolenBike(id: Long): StolenBike {
        return remoteDataSource.getStolenBike(id)
    }

}