package com.example.appsmoviles_practica1_3.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var square_area: MutableLiveData<Float> = MutableLiveData()
    val square_areaDone: LiveData<Float> = square_area

    private var triangle_area: MutableLiveData<Float> = MutableLiveData()
    val triangle_areaDone: LiveData<Float> = triangle_area

    private var circle_area: MutableLiveData<Float> = MutableLiveData()
    val circle_areaDone: LiveData<Float> = circle_area

    fun calc_square(lado_c: Float){
        square_area.value = lado_c * lado_c
    }

    fun calc_triangle(base_t: Float, altura_t: Float){
        triangle_area.value = (base_t * altura_t)/2
    }

    fun calc_circle(radio_c: Float){
        circle_area.value = 3.141592f * radio_c * radio_c
    }

}