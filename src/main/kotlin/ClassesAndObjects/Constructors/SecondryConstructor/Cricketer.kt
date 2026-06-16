package org.example.ClassesAndObjects.Constructors.SecondryConstructor

import org.example.ClassesAndObjects.Student
import javax.swing.text.Position

class Cricketer {

    var name = ""
    var position =""
    var role= ""
    var number =0
        constructor(name: String, position: String){
            this.name = name
            this.position = position
        }
    constructor(name: String,position: String,role: String, number: Int) : this(name,position){
        this.number = number;


        this.role = role;
            println("player is  $name")
        println("plays with $position hand")
        println("Jursey number $number")
        println("and he is a $role")
    }

}