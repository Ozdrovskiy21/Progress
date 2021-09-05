fun main() {
    phonebook()
}

fun phonebook() {
    println("Введите количество телефонных номеров")
    var n = readLine()?.toIntOrNull() ?: return
    while (true) {
        if (n < 0) {
            println("Введите положительное число!")
            n = readLine()?.toIntOrNull() ?: return
        } else {
            listOfTelephoneNumbers(n)
            break
        }
    }
}

fun listOfTelephoneNumbers(n: Int): MutableList<String> {
    println("Введите $n номера телефона")
    var numbers: MutableList<String> = mutableListOf()
    for (i in 0 until n) {
        numbers.add(readLine().toString())
    }
    val numbersFilter = numbers.filter { it.startsWith("+7") }
    println("Номера начинающиеся с +7: " + numbersFilter)

    val amountOFUnicNumbers = numbers.toSet().toList().size
    println("Количество уникальных номеров: " +amountOFUnicNumbers)


    println("Cуммa длин всех номеров телефонов: " + numbers.sumOf { it.length })


    for(i in 0 until amountOFUnicNumbers) {
        print("Введите имя человека с номером телефона " + numbers.toSet().toList()[i] + ":  ")
        val namesToTelephones = mutableMapOf(
            numbers.toSet().toList()[i] to readLine().toString()
        )
    }


    return numbers
}
