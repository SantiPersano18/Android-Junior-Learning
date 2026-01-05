package com.example.kotlin_practica

fun main(){
    println("Throw")

    val ex = "Lucy"
    val nombre =  readln()
    try {
        if (nombre == ex) {
            throw Exception("OPA")
        } else {
            println("Nom: $nombre")
        }
    }catch (e: Exception){
        println(e)
    }finally{ //Opcional, siempre se ejecuta
        println("Finally")
    }

    println("Try Catch Finally")


}