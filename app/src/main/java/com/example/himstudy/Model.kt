package com.example.himstudy

data class Hobby(var title : String)

object Supplier{
    val hobbies = listOf<Hobby>(
        Hobby("Swimming"),
        Hobby("Dancing"),
        Hobby("Cycling"),
        Hobby("Driving")
    )
}