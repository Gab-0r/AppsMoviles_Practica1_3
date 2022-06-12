package com.example.appsmoviles_practica1_3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appsmoviles_practica1_3.databinding.ActivityMainBinding

private lateinit var mainBinding: ActivityMainBinding

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        with(mainBinding){

            buttonCuadrado.setOnClickListener{
                var lado_c = textInputEditTextLado1cuadrado.text.toString().toInt()
                var area = lado_c * lado_c
                textViewAcuadrado.text = area.toString() + " m2"
            }

            buttonTriangulo.setOnClickListener{
                var base_t = textInputEditTextBaseT.text.toString().toInt()
                var altura_t = textInputEditTextAlturaT.text.toString().toInt()
                textViewAtriangulo.text = (base_t * altura_t/2).toString()  + " m2"
            }

            buttonAcirculo.setOnClickListener{
                var radio_c = TextInputEditTextRadio.text.toString().toInt()
                textViewAcirculo.text = (3.141592f * radio_c * radio_c).toString() + " m2"
            }
        }
    }
}