fun main() {
    val samsung = TV("Sumsung", "UE49KS7000U", 30.0, 34)
    val lg = TV("LG", "NM2323KS340U", 32.0, 123)
    val sony = TV("Sony", "HR4934300U", 40.0, 100)
    var n: Int = readLine()?.toInt() ?: 0
    if(n > Chanel.listOfChannels.size){
        println("Error. There only ${Chanel.listOfChannels.size} channels")
    }
    lg.turnOnTV()
    lg.switchChanel(n)
   lg.buttonDown()
    lg.listOfChannelsToMap()




}
