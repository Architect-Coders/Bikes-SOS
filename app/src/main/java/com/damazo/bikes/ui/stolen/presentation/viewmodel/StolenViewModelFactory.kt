package com.damazo.bikes.ui.stolen.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.damazo.bikes.ui.stolen.data.repository.StolenRepository

class StolenViewModelFactory(
    private val stolenRepository: StolenRepository
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return StolenViewModel(stolenRepository) as T
    }

}