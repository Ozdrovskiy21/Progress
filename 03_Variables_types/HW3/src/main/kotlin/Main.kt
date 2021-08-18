fun main() {

    val firstName: String = "Vladislav"
    val lastName: String = "Ozdrovskiy"

    var hight: Double = 181.0
    var weight: Float = 75.5f
    var isChild: Boolean = hight>150 && weight>40

    val info = """
        |$firstName $lastName
        |hight: $hight
        |weight: $weight
        |$isChild
    """.trimMargin()
    println(info)



}