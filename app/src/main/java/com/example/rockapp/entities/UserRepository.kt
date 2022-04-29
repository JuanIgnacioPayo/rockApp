package com.example.rockapp.entities

class UserRepository {

    var userList: MutableList<User> = mutableListOf()

    init {

        userList.add(User("norberto", "1234"))
        userList.add(User("mary", "1234"))
        userList.add(User("lau", "1234"))
        userList.add(User("fer", "1234"))
        userList.add(User("evi", "1234"))
        userList.add(User("guille", "1234"))
        userList.add(User("noe", "1234"))
        userList.add(User("dani", "1234"))
        userList.add(User("esti", "1234"))
        userList.add(User("juan", "1234"))

    }
}