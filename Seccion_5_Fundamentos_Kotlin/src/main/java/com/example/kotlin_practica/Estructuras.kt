package com.example.kotlin_practica

fun main(){
    println("Estructuras de datos")
    println("Lista inmutable")

    val listadiashabiles: List<String> //Solo se puede leer o extraer datos, no agregar
    listadiashabiles = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println("Lista de solo lectura:\n$listadiashabiles")
    println("Dia en la posicion 0 = ${listadiashabiles[0]}")


    println("Lista Mutable")
    val listamutable: MutableList<String>
    listamutable = mutableListOf("Ricardo", "Magdalena", "Laura")
    println(listamutable)
    listamutable.add("Juan")
    println(listamutable)
    listamutable.remove("Juan")
    println(listamutable)
    listamutable.removeAt(0)
    println(listamutable)
    listamutable.set(0, "Juan") // listamutable[0](0, "Juan")
    println(listamutable)

    println("MAP(Diccionario)")
    val mapinventario = mutableMapOf<String, Int>()
    mapinventario["T1"] = 13
    mapinventario["M2"] = 4
    mapinventario["T2"] = 54
    println("Inventario: $mapinventario")
    mapinventario.remove("T1")
    println("Inventario: $mapinventario")
    println(mapinventario.keys)
    println(mapinventario.values)

    println("Transformaciones:")
    var precios = listOf(10,20,5)
    println("Impuestos: ${precios.map { it * .16 }}")
    val bebidas = listOf("Soda", "Agua", "Cerveza")

    println("Menu: ${bebidas zip precios}")

    val numeros = listOf(listOf(1,2,3), listOf(4,5,6), listOf(7,8,9))
    println(numeros)
    println(numeros.flatten()) //Muestra todo en una lista simple, aplana todo

    println("Filtros:")
    val herramientas = listOf("Tuercas", "Martillo", "Tablas de 2x2")
    println(herramientas.filter { it.length <= 8 })
    println(herramientas.filter { it.contains("s")})
    println("Indice de Martillo = ${herramientas.indexOf("Martillo")}")


    println("Ordenamiento:")
    println(listadiashabiles)
    println("Reversa: ${listadiashabiles.reversed()}")
    println("Ordenado: ${listadiashabiles.sorted()}")
    println("Ordenado por: ${listadiashabiles.sortedBy { it.length }.reversed()}")
}