package org.example.Variable

fun main() {
    var hindi: Int ;
    var pbi: Int;
    var eng : Float;
    var math : Int;
    var Sci: Int;
    var total : Float;
    var percent : Float;
    println("Please enter hindi marks")
    hindi = readln().toInt();

    println("Enter your punjabi marks")
    pbi  = readln().toInt();

    println("Enter your eng marks")

    eng = readln().toFloat();

    total = hindi + pbi+ eng;

    percent = total/300 * 100;

    print("Total marks is $total")

}