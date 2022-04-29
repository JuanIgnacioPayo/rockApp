package com.example.rockapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.rockapp.R
import com.example.rockapp.entities.Band
import com.example.rockapp.viewmodels.FeaturesViewModel

@Suppress("DEPRECATION")
class FeaturesFragment : Fragment() {

    private lateinit var viewModel: FeaturesViewModel
    lateinit var v: View
    private lateinit var name: TextView
    private lateinit var style: TextView
    private lateinit var description: TextView
    private lateinit var members: TextView
    private lateinit var image: ImageView
    private lateinit var band : Band

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.features_fragment, container, false)

        return v
    }

    override fun onStart() {
        super.onStart()

        name = v.findViewById(R.id.txtName)
        style = v.findViewById(R.id.txtStyle)
        members = v.findViewById(R.id.txtMembers)
        description = v.findViewById(R.id.txtDescription)
        image = v.findViewById(R.id.avatar)
        band = FeaturesFragmentArgs.fromBundle(requireArguments()).band!!

        name.text = band.name
        style.text = band.style
        members.text = band.members
        description.text = band.descripcion
        image.setImageDrawable(v.context.getDrawable(band.image))

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FeaturesViewModel::class.java)

    }

}