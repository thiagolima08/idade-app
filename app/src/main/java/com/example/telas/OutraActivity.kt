package com.example.telas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class OutraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        val msg = intent.getParcelableExtra<Pessoa>("pessoa")
        val textoText = findViewById<TextView>(R.id.texto)
        textoText.text = "${msg?.nome}, você possui ${msg?.idade().toString()} anos"

        textoText.setOnClickListener { finish() }
//
//        Log.i("APP_TELAS", msg.toString())
    }

//    fun clickBotao(view: View){
//        val intent = Intent()
//        intent.putExtra("MSG_VOLTA", "Funciona mesmo!")
//        setResult(Activity.RESULT_OK, intent)
//        finish()
//    }
}