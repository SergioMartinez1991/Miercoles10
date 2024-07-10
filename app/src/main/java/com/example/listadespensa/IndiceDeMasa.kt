package com.example.listadespensa

/*
fun main (){
    val peso = 40
    val altura = 1.65

    val multi =   (altura * altura)
    val IMC = (peso / multi)

    println(IMC)

    if (IMC < 18){
        println("se feliz")
    }
    else {
        println("Cuida tu consumo de papitas")
    }

}*/

fun main (){
    println("ingresa tu peso")
    val peso = readln().toDouble()
    println("ingresa tu altura")
    val altura = readln().toDouble()

    val multi =   (altura * altura)
    val IMC = (peso / multi)

    println(IMC)

    if (IMC < 18){
        println("se feliz")
    }
    else {
        println("Cuida tu consumo de papitas")
    }

}