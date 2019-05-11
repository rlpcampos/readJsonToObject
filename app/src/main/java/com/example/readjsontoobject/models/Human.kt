package com.example.readjsontoobject.models

class Human {

    private val _id: String? = null
    private val tags: List<String>? = null
    private val phone: String? = null
    private val index: Int = 0
    private val favoriteFruit: String? = null
    private val greeting: String? = null
    private val about: String? = null
    private val guid: String? = null
    private val isActive: Boolean = false
    private val picture: String? = null
    private val balance: String? = null
    private val friends: List<MiniHuman>? = null
    private val address: String? = null
    private val eyeColor: String? = null
    private val email: String? = null
    private val registered: String? = null
    private val age: Int = 0
    private val name: String? = null
    private val company: String? = null
    private val gender: String? = null
    private val longitude: Double = 0.toDouble()
    private val latitude: Double = 0.toDouble()
    private val radiostations: List<Radiostation>? = null
    private val notes: List<Note>? = null

}

class MiniHuman {

    private val id: Long = 0
    private val name: String? = null
    private val gender: String? = null
    private val company: String? = null
    private val email: String? = null
    private val phone: String? = null
    private val address: String? = null
    private val about: String? = null
}

class Note {
    private val id: String? = null
    private val updatedAt: String? = null
    private val latitude: Double = 0.toDouble()
    private val longitude: Double = 0.toDouble()
    private val createdById: String? = null
    private val createdAt: String? = null
    private val deviceCreatedAt: String? = null
    private val text: String? = null
}

class Radiostation {
    private val id: String? = null
    private val _id: String? = null
    private val stationId: String? = null
    private val name: String? = null
}
