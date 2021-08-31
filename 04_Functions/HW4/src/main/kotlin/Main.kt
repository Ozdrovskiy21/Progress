fun main() {
    var string: String = "F2p)v\"y233{0->c}ttelciFc"
    println(transcript1Part(string.substring(0, string.length/2)) +
            transcript2Part(string.substring(string.length/2, string.length)))
    
}


fun transcript1Part(sourceString: String): String {
    var shiftedString = sourceString.map {char -> char + 1}.joinToString("")
    println("2.5 "+shiftedString+ " Сдвиг каждого символа вправо на 1")

    shiftedString=  shiftedString.replace('5','s')
    println("2.4 "+shiftedString+ " Замена цифры 5 на символ s.")

    shiftedString=  shiftedString.replace('4','u')
    println("2.3 "+shiftedString+ " Замена цифры 4 на символ u.")

    shiftedString = sourceString.map {char -> char - 3}.joinToString("")
    println("2.2 "+shiftedString+" Сдвиг каждого символа влево на 3")

    shiftedString=  shiftedString.replace('0','o')
    println("2.1 "+shiftedString+ " Замена цифры 0 на символ o.")

    return shiftedString
}

fun transcript2Part(sourceString: String): String {
    var shiftedString = sourceString.reversed()

    shiftedString = shiftedString.map {char -> char - 4}.joinToString("")

    shiftedString=  shiftedString.replace('_',' ')

    return shiftedString
}