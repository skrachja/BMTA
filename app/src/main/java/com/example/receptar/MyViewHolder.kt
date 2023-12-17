package com.example.receptar

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View, recyclerViewInterface : RecyclerViewInterfaca) : RecyclerView.ViewHolder(view){
    private var nazevView : TextView?
    private var popisView : TextView?

    init {
        nazevView = view.findViewById(R.id.nazevView)
        popisView = view.findViewById(R.id.popisView)

        view.setOnClickListener(View.OnClickListener {
            if (recyclerViewInterface != null){
                val pos:Int = adapterPosition

                if (pos != RecyclerView.NO_POSITION){
                    recyclerViewInterface.onItemClick(pos)
                }
            }
        })
    }

    fun setReceptData(nazev: String?, popis : String?) {
        nazevView?.text = nazev
        popisView?.text = popis
    }
}