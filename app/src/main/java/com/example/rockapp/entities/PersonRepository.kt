package com.example.rockapp.entities

import com.example.rockapp.R

class PersonRepository {

    var personList: MutableList<Person> = mutableListOf()

        init{
            personList.add(Person("Mary", "28-12-1947", R.drawable.renga))
            personList.add(Person("Norberto", "23-10-1942", R.drawable.pomelooo))
            personList.add(Person("Alicia", "29-4-1963", R.drawable.pomelooo))
            personList.add(Person("Laura", "10-4-1970",R.drawable.redondos))
            personList.add(Person("Fernanda", "9-10-1972", R.drawable.soda))
            personList.add(Person("Eva", "9-3-1973", R.drawable.divididos))
            personList.add(Person("Guillermo", "17-5-1976", R.drawable.baba))
            personList.add(Person("Daniela", "22-2-1978", R.drawable.almendra))
            personList.add(Person("Noel", "22-2-1978", R.drawable.wachi))
            personList.add(Person("Esteban", "13-1-1981", R.drawable.lgante))
            personList.add(Person("Juan", "21-10-1986", R.drawable.maroon))

}
}