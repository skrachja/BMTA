package com.example.receptar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), RecyclerViewInterfaca {

    val receptyModels : ArrayList<ReceptyModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleView : RecyclerView = findViewById(R.id.receptyRecyclerView)

        setUpReceptyModels()

        val adapter : R_RecyclerViewAdapter = R_RecyclerViewAdapter(receptyModels, this)

        recycleView.adapter = adapter

        recycleView.layoutManager = LinearLayoutManager(this)
    }

    private fun setUpReceptyModels(){
        val receptyNazvy : Array<String> = resources.getStringArray(R.array.recepty_nazev)
        val receptyPopisy : Array<String> = resources.getStringArray(R.array.recepty_popis)
        val receptyIngredience : Array<String> = resources.getStringArray(R.array.recepty_ingredience)
        val receptyRecept : Array<String> = resources.getStringArray(R.array.recepty_recept)

        for (i in receptyNazvy.indices){
            receptyModels.add(ReceptyModel(receptyNazvy[i], receptyPopisy[i], receptyIngredience[i], receptyRecept[i]))
        }
    }

    override fun onItemClick(position: Int) {
        val intent : Intent = Intent(this, ReceptActivity::class.java)

        intent.putExtra("Nazev", receptyModels[position].nazev)
        intent.putExtra("Popis", receptyModels[position].popis)
        intent.putExtra("Ingredience", receptyModels[position].ingredience)
        intent.putExtra("Recept", receptyModels[position].recept)

        startActivity(intent)
    }
}