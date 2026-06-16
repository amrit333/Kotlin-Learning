package org.example.Pairs

fun main() {

    var (a,v) = Pair(34,85)
        var name = Pair("Amrit", Pair("Simran", Pair("dhinam",34)));


    println(name.second.second.first)

    var student = Triple("Amrtpal","BCA",21403);

    println("Name is ${student.first} \n course is ${student.second}\nroll number is ${student.third}")
    println(v)
    print(a)
}