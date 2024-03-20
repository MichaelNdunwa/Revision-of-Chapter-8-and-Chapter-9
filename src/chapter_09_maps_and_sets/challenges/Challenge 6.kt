package chapter_09_maps_and_sets.challenges

/***
 * 6. Given the map:
 *          val nameTitleLookup: Map<String, String?> = mutableMapOf(
 *              "Mary" to "Engineer",
 *              "Patrick" to "Intern",
 *              "Ray" to "Hacker"
 *          )
 *     Set the value of the key "Patrick" to null and completely remove the key and value for "Ray"
 */

fun main() {
    val nameTitleLookUp: MutableMap<String, String?> = mutableMapOf(
        "Mary" to "Engineer",
        "Patrick" to "Intern",
        "Ray" to "Hacker"
    )
    nameTitleLookUp["Patrick"] = null
    println(nameTitleLookUp)

    println(nameTitleLookUp.remove("Ray"))
    println(nameTitleLookUp)
}