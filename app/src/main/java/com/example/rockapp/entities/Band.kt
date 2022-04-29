package com.example.rockapp.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Band (

    var name : String,
    var members: String,
    var style: String,
        var descripcion: String,
    var image : Int,


        ) : Parcelable {
}