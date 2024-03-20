package chapter_09_maps_and_sets.mini_exercises

/***
 * Mini-exercise:
 *      Write a function that prints a given player’s city and state.
 */

fun cityAndState(player: Map<String, String>) {
    println("city = ${player["city"]}, state = ${player["state"]}.")
}

val bobData = mutableMapOf(
    "name" to "Bob",
    "profession" to "CardPlayer",
    "country" to "USA",
    "state" to "CA",
    "city" to "San Francisco"
)

fun main() = cityAndState(bobData)