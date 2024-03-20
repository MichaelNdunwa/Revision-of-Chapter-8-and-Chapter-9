package chapter_09_maps_and_sets.challenges

/***
 * 5. Write a function that returns true if all of the values of a map are unique. Use a
 *     set to test uniqueness. This is the function signature:
 *     fun isInvertible(map: Map<String, Int>): Boolean
 */

fun isInvertible(map: Map<String, Int>): Boolean {
    val uniqueSet = mutableSetOf<Int>()
    map.values.forEach {
        uniqueSet.add(it)
    }
    return map.values.size == uniqueSet.size
}

fun isInvertibleA(map: Map<String, Int>) = map.values.toSet().size == map.values.size
fun main() {
    val invertibleMap = mapOf("1" to 1, "2" to 2, "3" to 3)
    val nonInvertibleMap = mapOf("1" to 3, "2" to 2, "3" to 3)

    println(isInvertible(invertibleMap))
    println(isInvertible(nonInvertibleMap))

    println("\nSolution 2:")
    println(isInvertibleA(invertibleMap))
    println(isInvertibleA(nonInvertibleMap))
}