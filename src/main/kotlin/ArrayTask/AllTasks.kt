package org.example.ArrayTask

fun main() {


    val intArray = createArray(2, 42);
    val intArray2 = createArray(5)

    val arr = intArrayOf(34, 43, 53, 5, 23, 5, 6, 2, 23)
    var sum: Int = sumOfArray(arr)
    print("sum of array is $sum")
}

// task 1
fun createArray(value: Int, size: Int): IntArray {

    // whever value i will define in this type in an array will be used everywhere
    val numbers = Array(size) { value };
    numbers[0] = 0
    numbers[1] = 10
    numbers[2] = -1
    return numbers.toIntArray();
}

// task 1.1
fun createArray(size: Int): IntArray {


    val numbers = Array(size) { 0 };

    numbers[0] = 0
    numbers[1] = 10
    numbers[2] = -1
    return numbers.toIntArray();
}

// task 2
fun sumOfArray(array: IntArray): Int {

    var sum: Int = 0;
    for (i in array) {
        sum += i;

    }

    return sum;
}