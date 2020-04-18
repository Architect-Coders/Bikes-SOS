package com.damazo.bikes.ui.stolen.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.damazo.bikes.common.CustomCoroutineScope
import com.damazo.bikes.model.StolenBike
import com.damazo.bikes.ui.stolen.data.repository.StolenRepository
import com.damazo.bikes.ui.stolen.presentation.StolenUiModel
import kotlinx.coroutines.launch

class StolenViewModel(
    private val stolenRepository: StolenRepository
) : ViewModel(), CustomCoroutineScope by CustomCoroutineScope.Impl(){

    private val model =  MutableLiveData<StolenUiModel>()

    val publicModel: LiveData<StolenUiModel>
        get() {
            if(model.value == null){
                refresh()
            }
            return model
        }

    init {
        initScope()
    }

    override fun onCleared() {
        cancelScope()
        super.onCleared()
    }

    private fun refresh() {
        launch {
            model.value = StolenUiModel.ProgressBar
            model.value = StolenUiModel.Content(stolenRepository.getStolenBikes(""))
        }
    }

    private fun onBikeSelected(bike: StolenBike){
        model.value = StolenUiModel.Navigation(bike)
    }
}