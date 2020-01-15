package com.example.prueba


fun main(args: Array<String>)
{
    class X(){
        operator fun invoke(n:Int):Int = n + 1
    }

    println(X()(8))
}