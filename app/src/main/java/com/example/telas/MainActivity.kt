package com.example.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btCalcular = findViewById(R.id.btMainCalcular)
        this.btCalcular.setOnClickListener({ clickBotao(it) })
    }

    fun clickBotao(view: View){
        val editTextNome = findViewById<EditText>(R.id.nome)
        val editTextAno = findViewById<EditText>(R.id.ano)
        val pessoa = Pessoa(editTextNome.text.toString(), editTextAno.text.toString().toInt())
        val intent = Intent(this, OutraActivity:: class.java)
        intent.putExtra("pessoa",pessoa)
        startActivity(intent)
        editTextNome.setText("")
        editTextAno.setText("")

    }


}