package org.example.Functions

fun main() {
        sum();
  var a : Int =   sum(343,63);
    println("Value of your sum is $a")
}

fun  sum(){
    print("Hey buddy i am sum function ");

}

fun  sum  (a : Int, b : Int) : Int{
        return a+b;
}