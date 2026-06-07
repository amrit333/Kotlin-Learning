package org.example

fun main() {


    var students = Array(34){ "" };

    print("Enter you name please ")
    students[0] = readln();

    print("Enter you name please ")
    students[1] = readln();print("Enter you name please ")
    students[2] = readln();print("Enter you name please ")
    students[3] = readln();print("Enter you name please ")
    students[4] = readln();print("Enter you name please ")
    students[5] = readln();print("Enter you name please ")
    students[6] = readln();print("Enter you name please ")
    students[7] = readln();

    println("Names are ");
    for (name : String in students){
        println(name)
    }



}