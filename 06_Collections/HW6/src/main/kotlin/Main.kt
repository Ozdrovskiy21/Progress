fun main() {
    phonebook()
}

fun phonebook() {
    println("Введите количество телефонных номеров")

    var n: Int
    do {
        n = readLine()?.toIntOrNull() ?: 0
        if (n <= 0) println("Введите положительное число!")

    } while (n <= 0)

    val nums = listOfTelephoneNumbers(n)

    numbersFilter(nums)
    amountOFUnicNumbers(nums)
    sumOfNumbers(nums)
    mutableMap(nums)

}

fun listOfTelephoneNumbers(n: Int): MutableList<String> {
    println("Введите $n номера телефона")
    var numbers: MutableList<String> = mutableListOf()
    for (i in 0 until n) {
        numbers.add(readLine().toString())
    }

    return (numbers)
}

fun numbersFilter(nums: List<String>) {
    val numbersFilter = nums.filter { it.startsWith("+7") }
    println("Номера начинающиеся с +7: " + numbersFilter)
}

fun amountOFUnicNumbers(nums: List<String>) {
    val amountOFUnicNumbers = nums.toSet().toList().size
    println("Количество уникальных номеров: " + amountOFUnicNumbers)

}

fun sumOfNumbers(nums: List<String>) {
    println("Cуммa длин всех номеров телефонов: " + nums.sumOf { it.length })
}

fun mutableMap(nums: List<String>) {
    val namesToTelephones = mutableMapOf<String, String>()

    for (number in nums.toSet()) {
        print("Введите имя человека с номером телефона ${number}: ")
        namesToTelephones[number] = readLine() ?: ""
    }

    for (entry in namesToTelephones) {
        println("Абонент: ${entry.value}. Номер телефона:${entry.key}  ")
    }

}
