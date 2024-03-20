package chapter_09_maps_and_sets

fun main() {
    // Sets
    /*** Creating sets ***/
    println("/*** creating sets ***/")
    val names = setOf("Anna", "Brian", "Craig", "Anna")
    println("names = $names")

    // Empty set:
    val hashSet = HashSet<Int>()

    /*** Set from arrays ***/
    println("\n/*** Set from arrays ***/")
    val someArray = arrayOf(1, 2, 3, 1)
    var someSet = mutableSetOf(*someArray, 4)
    println("someSet = $someSet")

    /*** Accessing elements ***/
    println("\n/*** Accessing elements ***/")
    println("someSet = ${someSet.contains(1)}")
    println("someArray = ${someArray.contains(1)}")
    println("4 in someSet = ${4 in someSet}")
    // first() and last() methods, can also be used, which return one of the elements in the set:
    println("someSet.first() = ${someSet.first()}")
    println("someSet.last() = ${someSet.last()}")

    someSet.forEach { println(it) }

    /*** adding and removing elements ***/
    println("\n/*** Adding and removing elements ***/")
    // adding:
    someSet.add(5)

    // removing:
    val removedOne = someSet.remove(1)
    println("removedOne -> $removedOne")

    println("someSet = $someSet")
}