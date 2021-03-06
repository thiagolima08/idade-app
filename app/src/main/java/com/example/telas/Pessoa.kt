package com.example.telas

import android.os.Parcel
import android.os.Parcelable

class Pessoa() : Parcelable{
    lateinit var nome: String
    var ano: Int = 0

    constructor(parcel: Parcel) : this() {
        nome = parcel.readString()!!
        ano = parcel.readInt()
    }

    constructor(nome: String, ano: Int): this(){
        this.nome = nome
        this.ano = ano
    }

    fun idade(): Int{
        return 2021 - this.ano
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeInt(ano)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pessoa> {
        override fun createFromParcel(parcel: Parcel): Pessoa {
            return Pessoa(parcel)
        }

        override fun newArray(size: Int): Array<Pessoa?> {
            return arrayOfNulls(size)
        }
    }
}