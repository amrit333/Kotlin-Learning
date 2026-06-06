package org.example.Functions

fun main() {
        var a : Int = Area(3,5);

    println("Area of Rectangle is $a")
    greet("Amrit")
    println("greet with giving them how to greet")
    greet("Ran", "Sat Shri Akal ")

    sumAll(34,53,453,432,53,235,324,63244)

    printResult(rollNumber = 34, Name = "Raj kumar", course = "B.tech")
}

fun Area(a : Int, b : Int): Int{
        return  a*b;
}

fun  greet(name : String , greet : String = "Hello"){
        println("$greet Mr/Ms. we are glad to have you because you are our beutifull client  ");
}

//in this function i will give name to perameter and calll them using their names and i don't have to worry about the order
fun printResult(Name: String, course: String, rollNumber: Int){


    println("Name \t\t : $Name")
    println("Course \t\t: $course")
    println("Roll no \t\t:$rollNumber")
}





// when i need to send multiple variables of same data type and i don't even have a count
// i can use var args function as i am already creating a single variable named a but USING SO MANY and a is a variable but working as an arr
//arrylist for me


fun sumAll(vararg  a : Int){
    var sum : Int=0
    for(i in a){
            sum +=i
    }
    println(sum)
}