package com.example.actividad_06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button) // Referencia de boton
        val editText = findViewById<EditText>(R.id.editTextID) // Referencia de editText

        boton.setOnClickListener {

            val inputText = editText.text.toString() // Obtenemos el texto del editText

            // Mostrar el Toast con el texto del EditText
            Toast.makeText(this, inputText, Toast.LENGTH_LONG).show()
        }


    }
}