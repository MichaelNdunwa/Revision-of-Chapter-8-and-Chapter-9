package chapter_08_arrays_and_lists.challenges

/***
 * 4. Arrays and lists have a reverse() method that reverses all the elements in-place,
 *      that is, within the original array or list. Write a function that does a similar thing,
 *      without using reverse(), and returns a new array with the elements of the
 *      original array in reverse order. This is the signature of the function:
 *
 *          fun reverse(array: Array<Int>): Array<Int>
 */

fun reverse(array: Array<Int>): Array<Int> {
    var reversedArray = arrayOf<Int>()
    var last = array.size - 1

    // Using while-loop:
    while (last >= 0) { reversedArray += array[last--] }

    // Using for-loop:
//    for (i in last downTo 0) { reversedArray += array[i] }

    // Using for-loop again:
//    for (i in array.indices) { reversedArray += array[array.size - i - 1] }

    return reversedArray
}

fun main() {
    val orderArray = arrayOf(1, 2, 3, 4, 5)
    println(reverse(orderArray).joinToString())
}