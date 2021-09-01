fun main() {
    FibonachiNumber()
}

fun FibonachiNumber() {
    println("Введите номер числа из последовательности Фибоначи")
    var n = readLine()?.toIntOrNull() ?: return
    var count1 = 1
    var count2 = 1
    while (true) {
        if (n < 0) {
            println("Введите положительное число")
            n = readLine()?.toIntOrNull() ?: return
        } else {
            for (i in 3..n) {
                var next = count1
                count1 += count2
                count2 = next
            }
            println("Число под номером $n из последовательности Фибоначи: "+count1)
            break
        }
    }
}