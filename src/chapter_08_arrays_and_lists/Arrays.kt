package chapter_08_arrays_and_lists

fun main(name: Array<String>) {
    val stringArray = arrayOf<String>("Michael", 1.toString())


    /*** Creating arrays: ***/
    println("\n/*** Creating arrays: ***/")
    val evenNumbers = arrayOf(2, 4, 6, 8)
    val fiveFives = Array(5) { 5 }

    // vowels:
    val vowels = arrayOf("a", "e", "i", "o", "u")


    /*** Arrays of primitive types ***/
    println("\n/*** Arrays of primitive types ***/")
    val oddNumbers = intArrayOf(1, 3, 5, 7)
    val zeroIntegers = IntArray(4) // 0, 0, 0, 0
    println(zeroIntegers.joinToString())

    val zeroDoubleValues = DoubleArray(4) // 0.0, 0.0, 0.0, 0.0

    // You can convert between the boxed(array of type objects) to primitive arrays using functions like toIntArray():
    val otherOddNumbers = arrayOf(1, 3, 5, 7).toIntArray()


    /*** Arguments to main() ***/
    println("\n/*** Arguments to main() ***/")
    println(name.joinToString())
}