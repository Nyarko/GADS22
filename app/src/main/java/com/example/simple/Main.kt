package com.example.simple

import com.example.simple.com.rsk.Person

fun main (args: Array<String>) {
    println("Hello World")

    val kevin = Person("Kevin")
    kevin.Name = "Olion"

    println("Your name is ${kevin.Name}")

    kevin.Name ="Steven"
    println("Your name is ${kevin.Name}")

    //kevin = Person()
}