package com.example.rockapp.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Person (

    var name : String,
    var birthday: String,
    var image : Int,


    ) : Parcelable {
}