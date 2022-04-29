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
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rockapp.R
import com.example.rockapp.entities.User
import com.example.rockapp.entities.UserRepository
import com.example.rockapp.viewmodels.LoginViewModel
import com.google.android.material.snackbar.Snackbar

@Suppress("DEPRECATION")
class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel
    private lateinit var v : View
    private lateinit var imgLogo: ImageView
    private lateinit var user: TextView
    private lateinit var pass: TextView
    private lateinit var bLogin: Button
    private lateinit var U_name : String
    private lateinit var U_password: String
    private var repoUsers : UserRepository = UserRepository()
    private var users = repoUsers.userList

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.login_fragment, container, false)
        imgLogo = v.findViewById(R.id.imgLogin)
        user = v.findViewById(R.id.txtName)
        pass = v.findViewById(R.id.txtPass)
        bLogin = v.findViewById(R.id.btnLogin)

        return v
    }

    override fun onStart() {
        super.onStart()

        imgLogo.setImageResource(R.drawable.rocklogo)

        bLogin.setOnClickListener {

            U_name = user.text.toString()
            U_password = pass.text.toString()

            var myUser = search(U_name, U_password)
            if(myUser != null){
                var action = LoginFragmentDirections.actionLoginFragmentToBandFragment(myUser)
                v.findNavController().navigate(action)

            } else {
                Snackbar.make(v, "USER or PASSWORD incorrect", Snackbar.LENGTH_SHORT).show()
            }

        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun search(name: String, pass: String): User? {
        return users.find { e -> e.name == name && e.password == pass }
    }

}