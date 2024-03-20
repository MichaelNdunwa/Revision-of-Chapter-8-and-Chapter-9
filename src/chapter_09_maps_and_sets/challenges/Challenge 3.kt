package chapter_09_maps_and_sets.challenges

/***
 * 3. Write a function that combines two maps into one. If a certain key appears in
 *     both maps, ignore the pair from the first maps. this is the function’s signature:
 *         fun mergeMaps(
 *             map1: Map<String, String>,
 *             map2: Map<String, String>
 *         ): Map<String, String>
 */

// This solution is wrong: don't make the same mistake in the future.
fun mergeMaps(
    map1: Map<String, String>,
    map2: Map<String, String>
): Map<String, String> {
    var theMergedMap = map1
    theMergedMap = map2
    return theMergedMap
}

// Solution from the textbook:
fun mergeMapsA(
    map1: Map<String, String>,
    map2: Map<String, String>
): Map<String, String> {
    val map3 = mutableMapOf<String, String>()
    map3.putAll(map1)
    map3.putAll(map2)
    return map3
}

fun main() {
    val firstMap = mapOf("1" to "2", "2" to "2")
    val secondMap = mapOf("1" to "1", "3" to "3")

    println(mergeMaps(firstMap, secondMap)) // Wrong solution
    println(mergeMapsA(firstMap, secondMap)) // Correct solution
}