package com.mburak.odev6papulica.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mburak.odev6papulica.Kategoriler
import com.mburak.odev6papulica.databinding.CardTasarimBinding

class Adapter(var mContext: Context,var KategoriListesi:List<Kategoriler>) :
    RecyclerView.Adapter<Adapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val liste = KategoriListesi.get(position)
        holder.tasarim.textView3.text = liste.ad
        val t = holder.tasarim

        t.su.setImageResource(mContext.resources.getIdentifier(liste.resim,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return KategoriListesi.size
    }

}
