package com.example.rockapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebBackForwardList
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rockapp.R
import com.example.rockapp.adapter.RockAdapter
import com.example.rockapp.entities.BandRepository
import com.example.rockapp.entities.User
import com.example.rockapp.viewmodels.BandViewModel

@Suppress("DEPRECATION")
class BandFragment : Fragment() {

    private lateinit var viewModel: BandViewModel
    lateinit var recyclerBand: RecyclerView
    lateinit var adapter: RockAdapter
    lateinit var v: View
    var repository : BandRepository = BandRepository()
    var bandas = repository.bandList
    private lateinit var usuario : User
    private lateinit var nombre : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.band_fragment, container, false)
        recyclerBand = v.findViewById(R.id.recBand)

        return v
    }

    override fun onStart() {
        super.onStart()
        recyclerBand.setHasFixedSize(true)
        recyclerBand.layoutManager = LinearLayoutManager(context)

        nombre =v.findViewById(R.id.txtUserLogin)
        usuario = BandFragmentArgs.fromBundle(requireArguments()).user!!
        nombre.text = usuario.name


        adapter = RockAdapter(bandas) {position ->

        var action = BandFragmentDirections.actionBandFragmentToFeaturesFragment(bandas[position])
            v.findNavController().navigate(action)


        }

        recyclerBand.adapter = adapter

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BandViewModel::class.java)

    }

}