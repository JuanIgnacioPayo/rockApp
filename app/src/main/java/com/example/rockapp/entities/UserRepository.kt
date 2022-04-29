package com.example.rockapp.entities

class UserRepository {

    var userList : MutableList<User> = mutableListOf()

    init{

        userList.add(User("fer", "123"))
        userList.add(User("juan", "456"))
        userList.add(User("ale", "789"))

    }
}