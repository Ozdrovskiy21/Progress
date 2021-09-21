import java.nio.channels.Channel
import javax.swing.AbstractButton

class TV(
    val brand: String,
    val model: String,
    val diagonal: Double = 24.1,
    private val channelQuantity: Int
) {
    private var onOrOff: Boolean = false
    private var maxVolume = 0.0
    var channelsList = Chanel.getRandomChannels(channelQuantity)
    var channel: Int = 0

    fun turnOnTV() {
        println("TV is ON")
        onOrOff = true
    }

    fun turnOffTV() {
        println("TV is OFF")
        onOrOff = false
    }

    fun volumeUP(volume: Double) {
        maxVolume += volume
    }

    fun volumeDown(volume: Double) {
        maxVolume -= volume
    }

    fun switchChanel(n: Int): Int {
         channel = n
        if(channel< channelsList.size) {
            if (!onOrOff) {
                turnOnTV()
            }
            channelsList[channel-1]
        }else channel = 1
        return channel
    }

   fun buttonUp(){
       channel
       if (onOrOff){
       if(channel < channelsList.size){
           channel += 1
       } else channel = 1
       } else channel
       println(channel)
    }

    fun buttonDown() {
        channel
        if (onOrOff){
        if(channel > 1){
            channel -= 1
        } else channel = channelsList.size
        } else channel
        println(channel)
    }


// не могу понять как из списка сделать map
    /*fun listOfChannelsToMap() {
        val listOfChannelsToNumbers = mutableMapOf<Int, String>()
        for (i in channelsList.toSet()){
            listOfChannelsToNumbers[i] = channelsList[i]
        }

        for (entry in listOfChannelsToNumbers) {
            println("${entry.key} - ${entry.value}.")
        }
    }

*/
}






