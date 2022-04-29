package com.example.rockapp.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

class User (

    var name : String,
    var password : String
) : Parcelable {

}