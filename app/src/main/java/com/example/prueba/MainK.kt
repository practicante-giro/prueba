package com.example.prueba


fun main(args: Array<String>)
{
    fun saludar(vararg nombres:String){
        for (nombre in nombres){
            println(nombre)
        }
    }

    saludar("carlos","oooooooooooo","suarez")
}