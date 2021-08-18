fun main() {

    val firstName: String = "Vladislav"
    val lastName: String = "Ozdrovskiy"

    var height: Double = 181.0
    var weight: Float = 75.5f
    var isChild: Boolean = height<150 || weight<40

    var info: String= """
        |$firstName $lastName
        |hight: $height
        |weight: $weight
        |$isChild
    """.trimMargin()
    println(info)
    height = 182.0
    weight = 40f
    info= """
        |$firstName $lastName
        |hight: $height
        |weight: $weight
        |$isChild
    """.trimMargin()
    println(info)





}