package org.example.ClassesAndObjects.Constructors

class Student(name: String , course : String , rollNumber : Int){
    var  name : String
    var course : String
    var rollNumber: Int
    init {
        this.name = name
        this.course = course
        this.rollNumber = rollNumber
    }


    fun printCertificate(){
        println("Welcome To Punjab School Education Board")
        println("Name : \t\t $name")
        println("Course : \t\t $course")
        println("Roll number is : \t $rollNumber")

    }


}