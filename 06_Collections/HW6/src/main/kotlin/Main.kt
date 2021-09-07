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


    listOfTelephoneNumbers(n)
    numbersFilter(n)
    amountOFUnicNumbers(n)
    sumOfNumbers(n)
    mutableMap(n)

}

fun listOfTelephoneNumbers(n: Int): MutableList<String> {
    println("Введите $n номера телефона")
    var numbers: MutableList<String> = mutableListOf()
    for (i in 0 until n) {
        numbers.add(readLine().toString())
    }

    return (numbers)
}

fun numbersFilter(n: Int) {
    val numbers = listOfTelephoneNumbers(n)
    val numbersFilter = numbers.filter { it.startsWith("+7") }
    println("Номера начинающиеся с +7: " + numbersFilter)
}

fun amountOFUnicNumbers(n: Int) {
    val numbers = listOfTelephoneNumbers(n)
    val amountOFUnicNumbers = numbers.toSet().toList().size
    println("Количество уникальных номеров: " + amountOFUnicNumbers)

}

fun sumOfNumbers(n: Int) {
    val numbers = listOfTelephoneNumbers(n)
    println("Cуммa длин всех номеров телефонов: " + numbers.sumOf { it.length })
}

fun mutableMap(n: Int) {
    val numbers = listOfTelephoneNumbers(n)
    val namesToTelephones = mutableMapOf<String, String>()

    for (i in 0 until numbers.toSet().toList().size) {
        println("Введите имя человека с номером телефона ${numbers[i]}:")
    }
    for (number in numbers.toSet()) {
        namesToTelephones[number] = readLine() ?: ""
    }

    for (entry in namesToTelephones) {
        println("Абонент: ${entry.value}. Номер телефона:${entry.key}  ")
    }

}
