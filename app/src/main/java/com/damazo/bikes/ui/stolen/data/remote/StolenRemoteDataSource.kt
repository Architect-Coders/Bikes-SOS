package com.damazo.bikes.ui.stolen.data.remote

import com.damazo.bikes.model.StolenBike
import com.damazo.bikes.ui.stolen.data.source.RemoteDataSource

class StolenRemoteDataSource: RemoteDataSource {
    override suspend fun getStolenBikes(region: String): List<StolenBike> {
        return emptyList()
    }

    override suspend fun getStolenBike(id: Long): StolenBike {
        return StolenBike(1L, "","", "", 2,"","","")
    }
}