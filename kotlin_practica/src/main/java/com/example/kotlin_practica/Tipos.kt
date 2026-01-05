package com.example.kotlin_practica

fun main() {
   /* println("Boolean: ")

    val Arg: Boolean = true

    println(Arg)
   */
    println("Numeros enteros")

    val paises: Int = 120

    print("Paises: ")
    println(paises)

    println("Int: " + Int.MAX_VALUE)

    val milisegundos: Long = 21_474_836_471L //Maximo soportado por int

    println("Milisegundos: " + milisegundos)

    println("Long: " + Long.MAX_VALUE) //Maximo Valor de Long



    println("Números decimales")
    val pesos: Float = 20.50f //Para float hay que poner si o si f porque sino se toma como double

    println("Float max: " + Float.MAX_VALUE + " min: " + Float.MIN_VALUE)



    val diametrodeluna: Double = 2.5666666666666664

    println("Double max: " + Double.MAX_VALUE + " min: " + Double.MIN_VALUE)


    println("Textos: ")
    val letra1: Char = 'S'
    val letra2: Char = 'A'
    println(letra1)
    val nomcompleto: String = "Santiago"
    println(nomcompleto)

    println("Hola mi nombre es $nomcompleto y mi primera letra es: $letra1")



    println("Concatenación:")
    val nombre = "Santiago" //readln() para ingresar datosa través de consola
    println("Hola " + nombre)
    println("Hola $nombre") //String Template, más utilizado

    println("Nulls")
    var sobrenombre: String? = null //? indica que podria ser null, si lo inicializo con "", marcaria que es 0
    println("Longitud de sobrenombre ${sobrenombre?.length}")
    sobrenombre = "SA"
    println("Longitud de sobrenombre ${sobrenombre!!.length}")// !! indica que no es null


    println("Operador Elvis:")
    var version: Int? = 3
    version = null
    println("La version actual es: ${version ?: 5 }") //operador elvis, si es null toma lo de la derecha (5)


}