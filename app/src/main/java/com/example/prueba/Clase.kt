package com.example.prueba

class Clase (numero:Int,cadena:String) {
    var name:String = ""
    var age:Int = 0

    fun avanzar(x:Int){
        println("Avanzando")
    }

    fun retroceder(x:Int,y:String){
        println("Retrocediendo")
    }

    fun brincar(x:Int):Int{
        return 9
    }
}