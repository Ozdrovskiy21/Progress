fun main() {
    println("Итог первой части: "+transcript1Part("F2p)v\"y233{0->c}ttelciFc"))
    println("Итог второй части: "+transcript2Part("F2p)v\"y233{0->c}ttelciFc"))
    println(transcript1Part("F2p)v\"y233{0->c}ttelciFc")+transcript2Part("F2p)v\"y233{0->c}ttelciFc"))
    //вопросы с разделением текста простым путём, пока оставил такой вывод.
}


fun transcript1Part(sourceString: String): String {
    var shiftedString = sourceString.map {char -> char + 1}.joinToString("")
    println("2.5 "+shiftedString+ " Сдвиг каждого символа вправо на 1")

    shiftedString=  shiftedString.replace('5','S', true)
    println("2.4 "+shiftedString+ " Замена цифры 5 на символ S.")

    shiftedString=  shiftedString.replace('4','U', true)
    println("2.3 "+shiftedString+ " Замена цифры 4 на символ U.")

    shiftedString = sourceString.map {char -> char - 3}.joinToString("")
    println("2.2 "+shiftedString+" Сдвиг каждого символа влево на 3")

    shiftedString=  shiftedString.replace('0','o', true)
    println("2.1 "+shiftedString+ " Замена цифры 0 на символ o.")

    return shiftedString
}

fun transcript2Part(sourceString: String): String {
    //3.3. Развернуть получившуюся строку. - не понял данный пункт, ещё более непонятно, что делать в обратном направлении.
    var shiftedString = sourceString.map {char -> char - 4}.joinToString("")
    println("3.2 "+shiftedString+" Сдвиг каждого символа влево на 4")

    shiftedString=  shiftedString.replace(' ','_', true)
    println("2.1 "+shiftedString+ " Замена пробелов на символ _.")

    return shiftedString
}