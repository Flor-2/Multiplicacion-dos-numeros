package com.example.suma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumero1: EditText
    private lateinit var edtNumero2: EditText
    private lateinit var btnMultiplicar: Button
    private lateinit var btnLimpiar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        txtResultado = findViewById(R.id.txtResultado)

        btnMultiplicar.setOnClickListener {

            if (edtNumero1.text.toString().isBlank() ||
                edtNumero2.text.toString().isBlank()
            ) {
                txtResultado.text = "Ingrese ambos números"
                return@setOnClickListener
            }

            val num1 = edtNumero1.text.toString().toInt()
            val num2 = edtNumero2.text.toString().toInt()

            txtResultado.text = "Resultado: ${multiplicar(num1, num2)}"
        }

        btnLimpiar.setOnClickListener {
            edtNumero1.text.clear()
            edtNumero2.text.clear()
            txtResultado.text = ""
            edtNumero1.requestFocus()
        }
    }

    private fun multiplicar(numero1: Int, numero2: Int): Int {
        return numero1 * numero2
    }
}