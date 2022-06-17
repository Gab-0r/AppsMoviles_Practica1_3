package com.example.appsmoviles_practica1_3.ui.main

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.appsmoviles_practica1_3.databinding.ActivityMainBinding

private lateinit var mainBinding: ActivityMainBinding
private lateinit var mainViewModel: MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mainViewModel.square_areaDone.observe(this){
            mainBinding.textViewAcuadrado.text = it.toString() + " m2"
        }

        mainViewModel.triangle_areaDone.observe(this){
            mainBinding.textViewAtriangulo.text = it.toString() + " m2"
        }

        mainViewModel.circle_areaDone.observe(this){
            mainBinding.textViewAcirculo.text = it.toString() + " m2"
        }

        with(mainBinding){

            buttonCuadrado.setOnClickListener{
                mainViewModel.calc_square(textInputEditTextLado1cuadrado.text.toString().toFloat())
            }

            buttonTriangulo.setOnClickListener{
                mainViewModel.calc_triangle(textInputEditTextBaseT.text.toString().toFloat(), textInputEditTextAlturaT.text.toString().toFloat())
            }

            buttonAcirculo.setOnClickListener{
                mainViewModel.calc_circle(TextInputEditTextRadio.text.toString().toFloat())
            }

        }
    }
}