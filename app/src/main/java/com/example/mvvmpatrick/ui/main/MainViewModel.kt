package com.example.mvvmpatrick.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmpatrick.domain.useCases.DamePresidenteUseCase

class MainViewModel(val damePresidenteUseCase: DamePresidenteUseCase) : ViewModel() {
    private val _state = MutableLiveData(MainState())

    val state : LiveData<MainState> = _state

    // eventos
    fun handleDamePresidente() : Unit {
        var presi = damePresidenteUseCase.damePresidente()
        _state.value = _state.value?.copy(presidente = presi.nombre)
    }

}