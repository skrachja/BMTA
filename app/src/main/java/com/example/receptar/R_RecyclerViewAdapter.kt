package com.example.receptar


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class R_RecyclerViewAdapter(val receptyModels : ArrayList<ReceptyModel>, val recyclerViewInterface : RecyclerViewInterfaca) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //Nastavování vzhledu pro každý řádek
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row, parent, false), recyclerViewInterface)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Přiřazení hodnot do views které jsme si vytvořili v recycler_view_row.xml
        // Celé to závisí na aktuální pozici recycler view
        holder.setReceptData(receptyModels[position].nazev, receptyModels[position].popis)
    }
    override fun getItemCount(): Int {
        return receptyModels.size
    }
}