package chapter_08_arrays_and_lists.challenges

/***
 * 5. The function below returns a random number between from (inclusive) and the to (exclusive):
 *
 *          import java.util.Random
 *          val random = Random()
 *          fun rand(from: Int, to: Int) : Int {
 *              return random.nextInt(to - from) + from
 *          }
 *
 *      Use it to write a function that shuffles the elements of an array in random order. This
 *      is the signature of the function:
 *
 *          fun randomized(array: Array<Int>): Array<Int>
 */

import java.util.Random

val random = Random()

fun rand(from: Int, to: Int) = random.nextInt(to - from) + from

// Solution 1:
fun randomized(array: Array<Int>): Array<Int> {
    var randomArray = arrayOf<Int>()
    while (randomArray.size != array.size) {
        val random = rand(0, array.size)
        val element = array[random]
        if (element !in randomArray) randomArray += element
    }
    return randomArray
}


// Solution 2: (Textbook solution)
fun randomized2(array: Array<Int>): Array<Int> {
    val newArray = Array(array.size) { 0 }
    val usedIndices = mutableListOf<Int>()

    for (i in array.indices) {
        var randomIndex = 0
        while (true) {
            randomIndex = rand(0, array.size)
            if (randomIndex !in usedIndices) {
                usedIndices.add(randomIndex)
                break
            }
        }
        newArray[i] = array[randomIndex]
    }
    return newArray
}


// Solution 3: (From chatGPT)
fun randomized3(array: Array<Int>): Array<Int> {
    val shuffledArray = array.copyOf()

    for (i in shuffledArray.indices) {
        val randomIndex = rand(0, shuffledArray.size)
        val temp = shuffledArray[i]
        shuffledArray[i] = shuffledArray[randomIndex]
        shuffledArray[randomIndex] = temp
    }
    return shuffledArray
}

// Solution 4: (Using Fisher-Yates Shuffle Algorithm)
fun fisherYatesShuffle(array: Array<Int>): Array<Int> {
    val shuffledArray = array.copyOf()

    for (i in shuffledArray.size - 1 downTo 1) {
        val randomIndex = rand(0, i + 1)
        val temp = shuffledArray[i]
        shuffledArray[i] = shuffledArray[randomIndex]
        shuffledArray[randomIndex] = temp
    }
    return shuffledArray
}


/***
 * I think my solution 1 is more efficient, but I can't say for sure because I can't ask chatGPT, reason being I don't
 * have internet access at the time I came up with the solution.
 */

fun main() {
    val arrayOrdered = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(randomized(arrayOrdered).joinToString())
    println(randomized2(arrayOrdered).joinToString())
    println(randomized3(arrayOrdered).joinToString())
    println(fisherYatesShuffle(arrayOrdered).joinToString())

}