package com.damazo.bikes.ui.stolen.presentation

import com.damazo.bikes.model.StolenBike

sealed class StolenUiModel {
    object ProgressBar : StolenUiModel()

    class Content(bikes: List<StolenBike>) : StolenUiModel()

    class Navigation(bike: StolenBike) : StolenUiModel()
}