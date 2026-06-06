package org.example.Variable

fun main() {
    var  age : Int;

    print("Enter you age please" );
    age = readln().toInt();

    var result: String = when{
        age > 18 -> "You can apply for voter card"
        else -> "you cannot apply "
    }
    print(result)
}