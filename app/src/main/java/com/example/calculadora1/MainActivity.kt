package com.example.calculadora1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //funcao oncreate: cria a tela caso nao tenha sido criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val texto = this.findViewById<TextView>(R.id.calculatrom)
        val botao = this.findViewById<Button>(R.id.botao1)
        var num1 = this.findViewById<EditText>(R.id.num1)
        var num2 = this.findViewById<EditText>(R.id.num2)
        var resultado = findViewById<TextView>(R.id.resultado)
        botao.setOnClickListener {
            var recebeResult = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            resultado.text = String.format("%.2f", recebeResult)
        }
    }
}