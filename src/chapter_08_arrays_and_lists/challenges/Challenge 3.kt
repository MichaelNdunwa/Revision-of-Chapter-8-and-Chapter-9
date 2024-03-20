package chapter_08_arrays_and_lists.challenges

/***
 * 3. Write a function that removes all occurrences of a given integer from a list of
 *      integers. This is the signature of the function:
 *
 *          fun remove(item: Int, list: List<Int>): List<Int>
 */

fun remove(items: Int, list: List<Int>): List<Int> {
    val mutableList = list.toMutableList()

    mutableList.removeAll(listOf(items))

    // OR:
//    for (i in list) { if (i == items) mutableList.remove(items) }

    // OR:
//    while (items in mutableList) { mutableList.remove(items) }

    return mutableList.toList()
}

fun main() {
    val listWithThrees = listOf(1, 2, 3, 4, 5, 3, 6, 3, 3)
    val removeThree = remove(3, listWithThrees)
    println(removeThree)
}