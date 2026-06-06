package org.example.Variable

fun main() {

    var age : Int;
    var  canApply : Boolean;

    age = readln().toInt();

    canApply = when{
        age>19-> true
        else -> false
    };

    print(canApply)
}