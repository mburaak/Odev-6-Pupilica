package com.mburak.odev6papulica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.mburak.odev6papulica.adapter.Adapter
import com.mburak.odev6papulica.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)


        binding.rv.layoutManager = GridLayoutManager(requireContext(), 4) //

        var KategoriListesi = ArrayList<Kategoriler>()

        val k1 = Kategoriler(1,"Su Ve İçecek","su")
        val k2 = Kategoriler(1,"Meyve&Sebze","su")
        val k3 = Kategoriler(1,"Fırından","su")
        val k4 = Kategoriler(1,"Atıştırmalık","su")
        val k5 = Kategoriler(1,"Dondurma","su")
        val k6 = Kategoriler(1,"Süt Ürünleri","su")
        val k7 = Kategoriler(1,"Kahvaltılık","su")
        val k8 = Kategoriler(1,"Yiyecek","su")



        KategoriListesi.add(k1)
        KategoriListesi.add(k2)
        KategoriListesi.add(k3)
        KategoriListesi.add(k4)
        KategoriListesi.add(k5)
        KategoriListesi.add(k6)
        KategoriListesi.add(k7)
        KategoriListesi.add(k8)

        val kategoriAdapter = Adapter(requireContext(),KategoriListesi)
        binding.rv.adapter = kategoriAdapter

        return binding.root
    }

}