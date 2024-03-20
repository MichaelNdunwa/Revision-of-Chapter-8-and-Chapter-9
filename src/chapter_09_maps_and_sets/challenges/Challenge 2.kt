package chapter_09_maps_and_sets.challenges

/***
 * 2. Given a map with two-letter state codes as keys, and the full state names as values,
 *         write a function that prints all the states with names longer than eight
 *         characters. For example, for the map mapOf("NY" to "New York", "CA" to
 *         "California"), the output would be California.
 */

fun stateWithGreaterThanEightLetters(states: Map<String, String>) {
    states.values.forEach {
        if (it.length > 8) {
            println(it)
        }
    }

}

fun main() {
    val state = mapOf(
        "NY" to "New York",
        "CA" to "California"
    )
    stateWithGreaterThanEightLetters(state)
}