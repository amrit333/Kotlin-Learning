package org.example.Loops

fun main() {
    for( i in 1..100 ){
        if(i%5==0){
            continue
        }
        else{
            println(i)
        }
    }
//        find sum of all even numbers;
    print("Enter you numebr please")
    var n = readln().toInt()
    var sum : Int = 0

   for(i in 1..n)
   {
       if (i%2==0){
            sum+=i;
       }
   }

    println("Sum of all numbers is $sum")



//    fibonaaci


        println("fibonaaci series")
        var a =0;
    var b = 1;
    println(a)
    for(i in 1..n)
    {
        var c = a+b
        println(c)

        a=b;
        b=c
    }

//    if the number i prime or not


}
