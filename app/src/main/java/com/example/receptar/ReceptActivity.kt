package com.example.receptar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recept)

        val nazev : String? = intent.getStringExtra("Nazev")
        val popis : String? = intent.getStringExtra("Popis")
        val ingredience : String? = intent.getStringExtra("Ingredience")
        val recept : String? = intent.getStringExtra("Recept")

        val nazevView : TextView = findViewById(R.id.nazevView)
        val popisView : TextView = findViewById(R.id.popisView)
        val ingredienceView : TextView = findViewById(R.id.ingredienceView)
        val receptView : TextView = findViewById(R.id.receptView)

        nazevView.text = nazev
        popisView.text = popis
        ingredienceView.text = ingredience
        receptView.text = recept

    }
}