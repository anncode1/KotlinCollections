package predicates

fun main() {

    val ages = listOf(12, 22, 17, 30, 29, 15)
    val adultAges = ages.filter {
        it >= 18
    }
    println(adultAges.joinToString())

    val kidsAges = ages.filterNot {
        it >= 18
    }

    println(kidsAges.joinToString())

    val allAges = ages.partition {
        it >= 18
    }

    val adultAges2 = allAges.first
    val kidsAges2 = allAges.second
    println(adultAges2.joinToString())
    println(kidsAges2.joinToString())

    val data = listOf("One", null, "Two", null, null, "Three")
    val dataNotNull = data.filterNotNull()
    println(dataNotNull.joinToString())


}