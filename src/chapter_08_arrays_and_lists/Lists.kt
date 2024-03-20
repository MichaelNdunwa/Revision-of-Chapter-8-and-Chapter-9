package chapter_08_arrays_and_lists

fun main() {
    /*** Creating list ***/
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")
    val firstInnerPlanet = innerPlanets.first()

    // Empty Lists:
    val subscribers = listOf<String>()


    /*** Mutable lists: ***/
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val exoPlanets = mutableListOf<String>()


    /*** Accessing elements ***/
    println("\n/*** Accessing elements ***/")
    // Using properties and methods:
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    println("players.isEmpty() = ${players.isEmpty()}")

    if (players.size < 2) println("We need at least two players!") else println("Let's start!")

    var currentPlayer = players.first()
    println("currentPlayer = $currentPlayer")

    val minPlayer = players.minOrNull()
    println("$minPlayer will start.")

    println(arrayOf(2, 3, 1).first())
    println(arrayOf(2, 3, 1).min())

    val maxPlayer = players.maxOrNull()
    if (maxPlayer != null) {
        println("$maxPlayer is the MAX")
    }

    // Using indexing:
    val firstPlayer = players[0]
    println("First player is $firstPlayer")

    val secondPlayer = players.get(1)


    /*** Using ranges to slice ***/
    println("\n/*** Using ranges to slice ***/")
    val upcomingPlayersSlice = players.slice(1..2)
    println("players = ${players.joinToString()}")
    println("upcomingPlayersSlice.joinToString() = ${upcomingPlayersSlice.joinToString()}")

    // Checking for an element:
    println("\n// Checking for an element:")
    fun isEliminated(player: String) = player !in players
    println(isEliminated("Bob")) // false
    players.slice(1..3).contains("Alice")



    /*** Modifying lists ***/
    println("\n/*** Modifying lists ***/")
    players.add("Eli")
    players += "Gina"
    println(players.joinToString())

    // While arrays are of fixed-size, you can in fact use the += operator with an array that is declared as var
    var array = arrayOf(1, 2, 3)
    array += 4
    println(array.joinToString())


    players.add(5, "Frank")

    // Removing elements:
    println("\n// Removing elements:")
    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed")

    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")


    /*** Updating elements ***/
    println("\n/*** Updating elements ***/")
    println(players.joinToString())
    players[4] = "Franklin"
    println(players.joinToString())

    players[3] = "Anna"
    // OR
    players.set(3, "Anna")
    players.sort()
    println(players.joinToString())

    /***
     * Note that while arrays are of fixed size and can otherwise not be changed, you can
     * update the elements of an array using indexing syntax.
     */
    val arrayOfInts = arrayOf(1, 2, 3)
    arrayOfInts[0] = 4
    arrayOfInts.set(2, 4)
    println(arrayOfInts.joinToString())



    /*** Iterating through a list ***/
    println("\n/*** Iterating through a list ***/")
    val scores = listOf(2, 2, 8, 6, 1)
    players.forEach { println(it) }

    players.forEachIndexed { index, player ->
        println("${index + 1}. $player")
    }

    fun sumOfElements(list: List<Int>): Int {
        var sum = 0
        for (number in list) {
            sum += number
        }
        return sum
    }

    /*** Nullability and collection types ***/
    println("\n/*** Nullability and collection types ***/")
    var nullableList: List<Int>? = listOf(1, 2, 3, 4)
    nullableList = null
    var listOfNullables: List<Int?> = listOf(1, 2, null, 4)
    var nullableListOfNullables: List<Int?>? = listOf(1, 2, null, 4)
    nullableListOfNullables = null
}