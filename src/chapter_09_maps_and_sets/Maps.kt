package chapter_09_maps_and_sets

import java.util.HashMap

fun main() {
    /*** Creating maps ***/
    println("/*** Creating maps ***/")
    val moviesAndYearOfRelease = mapOf(
        Pair("Snow White", 2002),
        Pair("Extractor", 2023),
        Pair("The Beekeeper", 2024)
    )
    println("moviesAndYearOfRelease => $moviesAndYearOfRelease")

    val yearOfBirth = mapOf(
        "Anna" to 1990,
        "Brian" to 1991,
        "Craig" to 1992,
        "Donna" to 1993
    )
    println("yearOfBirth => $yearOfBirth")

    var namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    println("namesAndScores => $namesAndScores")

    namesAndScores = mutableMapOf()

    // Creating empty map with map constructor:
    var pairs = HashMap<String, Int>()

    // When you create a map, you can define its capacity:
    pairs = HashMap<String, Int>(20)
    /*val limitOfThreeMaps = HashMap<String, Int>(3)
    limitOfThreeMaps.putAll(yearOfBirth)
    println("limitOfThreeMaps => $limitOfThreeMaps")*/

    /*** Accessing values ***/
    println("\n/*** Accessing values ***/")
    // Using the index operator:
    namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 8,
        "Craig" to 8,
        "Donna" to 6
    )
    println("Anna's score is ${namesAndScores["Anna"]}")
    println("Greg's score is ${namesAndScores["Greg"]}")  // this will return null, 'cause Greg isn't in the map.

    // Using properties and methods:
    println("Craig's score is ${namesAndScores.get("Craig")}")

    // Maps also have isEmpty() and size members:
    namesAndScores.isEmpty()
    namesAndScores.size


    /*** Modifying mutable maps ***/
    println("\n/*** Modifying mutable maps ***/")
    // Adding pairs:
    val bobData = mutableMapOf(
        "name" to "Bob",
        "profession" to "CardPlayer",
        "country" to "USA"
    )
    bobData.put("state", "CA")
    // Using subscripting to add pairs:
    bobData["city"] = "San Francisco"

    // Updating values:
    val previousName = bobData.put("name", "Bobby")
    println(previousName) //Bob
    println(bobData.put("name", "Gobby")) //Bobby

    bobData["profession"] = "Mailman"

    // Using += operator to update value:
    val pair = "nickname" to "Bobby D"
    bobData += pair
    println("bobData = $bobData")

    // Removing pairs:
    bobData.remove("city")
    bobData.remove("state", "CA")


    /*** Iterating through maps ***/
    println("\n/*** Iterating through maps ***/")
    // destructuring declaration:
    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }

    // using my favorite forEach {} lambda function:
    namesAndScores.forEach { (player, score) -> println("$player - $score") }

    for (player in namesAndScores.keys) {
        print("$player, ")
    }
    println()

    namesAndScores.values.forEach { print("$it, ") }
    println()

}
