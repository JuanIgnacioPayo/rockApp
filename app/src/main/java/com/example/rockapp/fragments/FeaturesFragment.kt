package com.example.rockapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.rockapp.R
import com.example.rockapp.entities.Person
import com.example.rockapp.viewmodels.FeaturesViewModel

@Suppress("DEPRECATION")
class FeaturesFragment : Fragment() {

    private lateinit var viewModel: FeaturesViewModel
    lateinit var v: View
    private lateinit var name: TextView
    private lateinit var birthday: TextView
    private lateinit var image: ImageView
    private lateinit var person : Person

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
        birthday = v.findViewById(R.id.txtMembers)
        image = v.findViewById(R.id.avatar)
        person = FeaturesFragmentArgs.fromBundle(requireArguments()).person!!

        name.text = person.name
        birthday.text = person.birthday
        image.setImageDrawable(v.context.getDrawable(person.image))

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FeaturesViewModel::class.java)

    }

}