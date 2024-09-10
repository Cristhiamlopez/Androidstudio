package com.example.aplicacinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun MetodoBoton(view: View){
        val editText = findViewById<EditText>(R.id.editTextText)
          val nombre = editText.text.toString()
          Toast.makeText(this,"Eres el mejor programador $nombre",Toast.LENGTH_SHORT).show()

    }
}