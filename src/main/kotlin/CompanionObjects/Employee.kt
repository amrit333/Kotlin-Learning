package org.example.CompanionObjects

class Employee {
    var name =""
    var id = 0
    companion object {
        var department = ""
    var count = 0
        fun printData(){
            println("Employee departmetn  is  $department" )
        }
    }

    constructor(){
        count++
    }

}