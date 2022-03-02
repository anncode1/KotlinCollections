package transformation

fun main() {

    val languages = listOf(
        "Java",
        "c",
        "php",
        "swift"
    )

    // Language: Java
    // for
    // "Language: Java" newList.add
    // for newList
    // (String) -> (String)
    val strLanguanges = languages.map {
        "Language: $it"
    }
    strLanguanges.forEach {
        println(it)
    }

    // (Int) -> (String)
    val numbers = listOf(1, 2, 3)
    val items =  numbers.map {
        "$it. Item"
    }
    println(items.joinToString())

    val data = listOf("1", "2", "*", "3", "/")
   val dataNumbers = data.mapNotNull {
        it.toIntOrNull()
    }
    println(dataNumbers)
    val sum = dataNumbers.sum()
    println(sum)

}