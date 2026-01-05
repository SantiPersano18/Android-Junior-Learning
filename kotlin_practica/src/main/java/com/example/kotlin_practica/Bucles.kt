package com.example.kotlin_practica

fun main(){
    println("Bucles o ciclos")
    println("For y ForEach")

    for(i in 1..5){
        println(i)
    }

    val nombre = "Alain"
    for(i in 0..<nombre.length){
       println("Indice $i = ${nombre[i]}")
    }

    for(letra in nombre){
        println(letra)
    }

    nombre.forEach { println(it) }


    println("While y Do While")
    var indice = 0
    while (indice < nombre.length){
        println("Indice: $indice = ${nombre[indice]}")
        indice++
    }

    do{
        indice--
        println("Indice: $indice = ${nombre[indice]}")
    }while(indice > 0) //Sirve solo para que se ejecute una vez, no me interesa el true o el flase


    println("return, break y continue")
    for(i in 0..4){
        if(i == 2)
            break //Termina el ciclo o bucle
        println("indice: $i")

    }
    for(i in 0..4){
        if(i == 2)
            continue //Salto el escenario actual
        println("indice: $i")

    }

    for(i in 0..4){
        if(i == 2)
            return //Termina el contexto actual, es decir la funcion actual que seria main
        println("indice: $i")

    }




}