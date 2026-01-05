package com.example.kotlin_practica


import java.util.Date


val global = 9
lateinit var texto: String // Solo sirve para las variables globales
val lazytime: Long by lazy { time() } //Se guarda en memoria solamente cuando se llama a la variable


fun time() = System.currentTimeMillis()

fun main () {
    println("Tiempo inicial: ${time()}")
    tema("Varbiables locales vs globales")
    val local = 5
    println("Local: $local")
    println("Global: $global")
    //println("local(): ${local()}")

    tema("Constantes")
    println(Constantes.fechanacimiento)
    val x = readln().toInt()
    println(x * 2)
    tema("lateinit")
    texto = readln()
    println("local(): ${local()}")
    println("local(): ${local()}")


    tema("Lazy")
    println("Tiempo perezoso: $lazytime")
}

fun local(){
    val local = 8
    //println(local)
    texto = "- $texto -"
    println(texto)
}

fun tema(texto: String){
    println("\n${Constantes.SEPARADOR} $texto ${Constantes.SEPARADOR}")

}