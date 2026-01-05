package com.example.kotlin_practica

fun main(){

    println("Operador Elvis:")
    var version: Int? = 3
    version = null
    println("La version actual es: ${version ?: 5 }") //operador elvis, si es null toma lo de la derecha (5)


    println("Operadores Matematicos:")
    println("Ingrese ujn valor numerico: ")
    var x = readln()
    println("Ingrese ujn valor numerico: ")
    var y = readln()
    println("x + y = ${x.toInt() + y.toInt()}")
    println("x + y = ${x.toInt() - y.toInt()}")
    println("x + y = ${x.toInt() * y.toInt()}")
    println("x + y = ${x.toInt() / y.toInt()}")
    println("x + y = ${x.toInt() % y.toInt()}")

    var numX = x.toInt()
    var numY = y.toInt()
    numX += 1 // numX++ o numX = numX + 1
    println("x + 1 = $numX")

    numY += 1 // numY++ o numY = numY + 1
    println("y + 1 = $numY")

    numX *= 2
    println("numX * 2 $numX")
    numX /= 2
    println("numX / 2 $numX")


    println("Operadores de igualdad:")
    val esigual = (3 == 3)//true //(2 == 4)  false
    val noesigual = (2 != 4)//true
    println(esigual)
    println(noesigual)


    println("Operadores Logicos")
    val or = (1==1 || 1==5)//true
    println("Or: $or")

    val and = (1==1 && 1==5)//false
    println("And: $and")

    println("Operadores comparativos:")

    val mayor = (7 > 3)//true
    val menor = (1 < 3)//true
    println("Mayor $mayor")
    println("Menor $menor")

    val mayorigual = (7 >= 7) //true
    val menorigual = (3 <= 3) //true

    println("Mayor igual $mayorigual")
    println("Menor igual $menorigual")





}