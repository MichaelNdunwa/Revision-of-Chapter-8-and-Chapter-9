package chapter_08_arrays_and_lists.mini_exercises

val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
val scores = listOf(2, 2, 8, 6, 1)
fun main() {
    println("The index of Dan is ${players.indexOf("Dan")}")

    /***
     * Mini-exercise
     *      Write a for loop that prints the players’ names and scores.
     */
    fun playersNamesAndScores(players: List<String>, scores: List<Int>) {
        players.forEachIndexed { index, name ->
            println("$name's score is ${scores[index]}")
        }
    }

    playersNamesAndScores(players, scores)
}