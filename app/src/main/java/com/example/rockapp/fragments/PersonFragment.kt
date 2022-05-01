package com.example.rockapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rockapp.R
import com.example.rockapp.adapter.PersonAdapter
import com.example.rockapp.entities.PersonRepository
import com.example.rockapp.entities.User
import com.example.rockapp.viewmodels.PersonViewModel

@Suppress("DEPRECATION")
class PersonFragment : Fragment() {

    private lateinit var viewModel: PersonViewModel
    lateinit var recyclerPerson: RecyclerView
    lateinit var adapter: PersonAdapter
    lateinit var v: View
    var repository : PersonRepository = PersonRepository()
    var personas = repository.personList
    private lateinit var usuario : User
    private lateinit var nombre : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.person_fragment, container, false)
        recyclerPerson = v.findViewById(R.id.recPerson)

        return v
    }

    override fun onStart() {
        super.onStart()
        recyclerPerson.setHasFixedSize(true)
        recyclerPerson.layoutManager = LinearLayoutManager(context)

        nombre =v.findViewById(R.id.txtUserLogin)
        usuario = PersonFragmentArgs.fromBundle(requireArguments()).user!!
        nombre.text = usuario.name


        adapter = PersonAdapter(personas) { position ->

        var action = PersonFragmentDirections.actionPersonFragmentToFeaturesFragment(personas[position])
            v.findNavController().navigate(action)


        }

        recyclerPerson.adapter = adapter

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PersonViewModel::class.java)

    }

}