package com.example.rockapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.rockapp.R
import com.example.rockapp.entities.Person

    class PersonAdapter (
        var personList: MutableList<Person>,
        var onClick : (Int)-> Unit)
        : RecyclerView.Adapter<PersonAdapter.PersonHolder>() {


    class PersonHolder(v : View) : RecyclerView.ViewHolder(v){

        var view: View

        init{
            this.view = v
        }

        fun setName (name: String){
            var txtName : TextView = view.findViewById(R.id.txtItemName)
            txtName.text = name
        }

        fun getCard () : CardView {
            return view.findViewById(R.id.card)
        }

        fun getImageView() : ImageView {
            return view.findViewById(R.id.imgItem)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return (PersonHolder(view))
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        var personas = personList[position]
        holder.setName(personas.name)
        holder.getImageView().setImageDrawable(holder.view.context.getDrawable(personas.image))


        holder.getCard().setOnClickListener{
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return personList.size
    }
}