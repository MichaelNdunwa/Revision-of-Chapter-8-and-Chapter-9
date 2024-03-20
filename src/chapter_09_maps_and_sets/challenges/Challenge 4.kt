package chapter_09_maps_and_sets.challenges

/***
 * 4. Declare a function occurrencesOfCharacters that calculates which characters
 *     occur in a string, as well as how often each of these characters occur. Return the
 *     result as a map. This is the function signature:
 *
 *     fun occurrencesOfCharacters(text: String): Map<Char, Int>
 *
 *     Hint: String is a collection of characters that you can iterate over with a for
 *     statement.
 *
 *     Bonus: To make your code shorter, maps have a special function that lets you
 *     add a default value if it is not found in the map. For example,
 *     map.getOrDefault('a', defaultValue = 0) returns 0 for the character ‘a’
 *     if it is not found, instead of simply returning null
 */

fun occurrenceOfCharacters(text: String): Map<Char, Int> {
    val characters = mutableMapOf<Char, Int>()
    var count = 0
    text.forEach { c ->
        count = text.count { it == c }
        characters += Pair(c, count)
    }
    return characters
}

fun main() {
    println(occurrenceOfCharacters("Michael"))
    println(occurrenceOfCharacters("I'm your huckleberry."))
}
