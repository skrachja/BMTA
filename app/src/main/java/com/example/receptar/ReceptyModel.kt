package com.example.receptar

class ReceptyModel(nazev : String?, popis: String?, ingredience: String?, recept: String?) {
    var nazev: String? = null
    var popis: String? = null
    var ingredience: String? = null
    var recept: String? = null

    init {
        this.nazev = nazev
        this.popis = popis
        this.ingredience = ingredience
        this.recept = recept
    }
}