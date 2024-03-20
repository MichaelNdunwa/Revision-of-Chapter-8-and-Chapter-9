package chapter_08_arrays_and_lists.challenges

/***
 * 6. Write a function that calculates the minimum and maximum value in an array of integers.
 *      Calculate these values yourself; don’t use the methods min and max.
 *      Return null if the given array is empty.
 *
 *      This is the signature of the function:
 *          fun minMax(numbers: Array<Int>): Pair<Int, Int>?
 *
 *      Hint: You can use the Int.MIN_VALUE and Int.MAX_VALUE constants within the function.
 */

fun minMax(numbers: Array<Int>): Pair<Int, Int>? {
    if (numbers.isEmpty()) return null

    var min = numbers[0]; var max = numbers[0]
    for (i in numbers) { if (i < min) min = i else max = i }

    return Pair(min, max)
}

fun main() {
    val integers = arrayOf(4, -54, -300, 23, 55666, 22, 1, -2223, 33, 11, 500000)
    println(minMax(integers))
}