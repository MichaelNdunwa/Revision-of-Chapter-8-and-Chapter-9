package chapter_08_arrays_and_lists.challenges

/***
 * 2. Write a function that removes the first occurrence of a given integer from a list of
 *      integers. This is the signature of the function:
 *
 *          fun removeOne(item: Int, list: List<Int>): List<Int>
 */

fun removeOne(item: Int, list: List<Int>): List<Int> {
    val mutableList = list.toMutableList()
    mutableList.remove(item)
    return mutableList.toList()
}

fun main() {
    val numbers = listOf(1, 2, 3, 1, 4)
    println(removeOne(1, numbers))
}