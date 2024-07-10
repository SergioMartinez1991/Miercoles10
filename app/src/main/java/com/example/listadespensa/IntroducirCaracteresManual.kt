package com.example.listadespensa

fun main (parametro: Array<String>){
    println("Ingresa el sueldo del empleado")
    //readln() sirve para ingresar datos manualmente
    val sueldo = readln().toDouble()
    if (sueldo > 3000){
        println("debes pagar impuestos")
    }
}