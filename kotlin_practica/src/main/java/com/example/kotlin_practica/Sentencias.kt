package com.example.kotlin_practica

fun main(){
    println("Sentencias")
    println("Ingrese un valor numerico: ")
    var x = readln().toInt()
    println("Ingrese un valor numerico: ")
    var y = readln().toInt()

    println("If Else")

    if(x == y){
        println("X es igual a Y")
    }else{
        println("X desigual a Y")
    }

    if(x > y){
        println("X es mayor a Y")
    }else if (x >= y){
        println("X es mayor o igual a Y")
    }else println("no es ni mayor ni igual")

    println("Sentencia when:")
    println("Ingresa tu nombre:")
    val nombre = readln()
    when(nombre){
        "Juan" -> println("$100.0")
        "Maria" -> println("$200.0")
        "Alberto" -> println("$300.0")
        "Ana" -> println("400.0")
        "Joy",
        "Guadalupe" -> println("$250.0")
        "Pedro" -> {
            println("$210.0")
            println("$110.0")
        }
        else -> println("$50.0 ")
    }


}