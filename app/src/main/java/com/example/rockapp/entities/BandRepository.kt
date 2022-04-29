package com.example.rockapp.entities

import com.example.rockapp.R

class BandRepository {

    var bandList: MutableList<Band> = mutableListOf()

        init{
            bandList.add(Band("Los Redondos", "5", "Rock", "La mejor banda Argentina lejos", R.drawable.redondos))
            bandList.add(Band("Soda Stereo", "4", "Rock", "Gracias Totales!!!", R.drawable.soda))
            bandList.add(Band("Divididos", "3", "Rock", "La aplanadora", R.drawable.divididos))
            bandList.add(Band("Babasonicos", "6", "Pop Rock", "una descripcion", R.drawable.baba))
            bandList.add(Band("Almendra", "4", "Rock", "con el flaco...", R.drawable.almendra))
            bandList.add(Band("Wachiturros", "7", "Cumbia", "Tirate un paso", R.drawable.wachi))
            bandList.add(Band("L-Gante", "1", "Cumbia 420", "Pa' lo negro", R.drawable.lgante))
            bandList.add(Band("Maroon 5", "5", "Funk", "no tengo idea", R.drawable.maroon))
            bandList.add(Band("La Renga", "5", "Rock Mataderos", "Los mismos de siempre", R.drawable.renga))
            bandList.add(Band("Pomelo", "1", "Rock nene", "Pomelo es Rock!", R.drawable.pomelooo))
            bandList.add(Band("El pepo", "3", "Cumbia", "Es 1 pero vale x 2", R.drawable.pepo))
            bandList.add(Band("Miranda", "2", "Pop", "Es la guitarra de Lolo??", R.drawable.miranda))
            bandList.add(Band("Axel","1","Melódico","Dedicado para Lauri",R.drawable.axel))

}
}