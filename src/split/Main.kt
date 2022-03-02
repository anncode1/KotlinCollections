package split

fun main() {
    val superMarket = listOf(
        "Milk",
        "Eggs",
        "Juice",
        "Meat",
        "Rice"
    )

    // n primeros elementos
    val breakFast = superMarket
        .take(3)
        .filterNot {
            // Milk Eggs Juice
            it == "Eggs"
        }
    println(breakFast.joinToString())

    // n últimos elementos
    val dinnerList = superMarket
        .drop(3)
    println(dinnerList.joinToString())

}