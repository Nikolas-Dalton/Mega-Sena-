package com.example.megasenaprojeto

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var textResultado: TextView
    private lateinit var btnGerar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textResultado = findViewById(R.id.textResultado)
        btnGerar = findViewById(R.id.btnGerar)

        btnGerar.setOnClickListener {
            val numeros = gerarNumerosMegaSena()
            textResultado.text = numeros.joinToString(" - ")
        }
    }

    private fun gerarNumerosMegaSena(): List<Int> {
        val lista = mutableListOf<Int>()
        while (lista.size < 6) {
            val numero = (1..60).random()
            if (!lista.contains(numero)) {
                lista.add(numero)
            }
        }
        lista.sort()
        return lista
    }
}