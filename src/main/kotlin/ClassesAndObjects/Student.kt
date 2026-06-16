package org.example.ClassesAndObjects



class Student{
    var name=""
    var course =""
    var fatherName = ""
    var motherName = ""
    var marks = 0


    fun admission(){
        print("Enter your name please")
        name = readln()
        print("Enter your course please")
        course = readln()
        print("Enter you father name")
        fatherName = readln()
        print("enter your mother name")
        motherName = readln()
        print("Enter your marks please")
        marks = readln().toInt()
    }
}