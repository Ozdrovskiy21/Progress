import java.nio.channels.Channel
import javax.swing.AbstractButton

class TV(
    val brand: String,
    val model: String,
    val diagonal: Double = 24.1,
    private val channelQuantity: Int,
) {
    private var channel: MutableList<Int> = (1..channelQuantity).toMutableList()
    private var onOrOff: Boolean = false
    private var maxVolume = 0.0
    var n: Int = readLine()?.toInt() ?: 0
    /*  fun inputChannel(): Int{
          var n: Int = readLine()?.toInt() ?: 0
        if(n > channelQuantity) {
            n=channelQuantity
            println("Канал $n")
            println("Максимальное число каналов $n")
        }
          return n
      }*/

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

    fun switchChanel(): Int {
        if (n > channelQuantity) {
            n = channelQuantity
            println("Максимальное число каналов $n")
        }
        if (!onOrOff) {
            turnOnTV()
            println("Телевизор включился на канале ${channel[n - 1]}")
        }
        return n
    }

    // вторая версия этой функции
    /*fun switchChanel(n: Int = readLine()!!.toInt()) {
        if (n>0) {
            if (onOrOff == false) {
                turnOnTV()
                println("Телевизор включился на канале ${channel[n]}")
            } else {
                println("Канал ${channel[n]}")
            }
        } else println("Введите положительное число!")
    }*/

    fun buttonUpOrDown() {
        println("Up or Down")
        val command = readLine().toString()
        if (command.lowercase() == "up" && channel[switchChanel() - 1] < channel.size - 1) println(channel[switchChanel() - 1] + 1)
        else if (command.lowercase() == "down") println(channel[switchChanel() - 1] - 1)
        else if (command.lowercase() != "down" && command.lowercase() != "up") println("Error")
        else {
            n = 1
            println(channel[switchChanel() - 1])
        }
    }

    fun listOfChannelsToMap() {
        val listOfChannelsToNumbers = mutableMapOf<Int, String>()
        for (i in channel.toSet()) {
            listOfChannelsToNumbers[i] = getRandomChannels()[i]
        }

        for (entry in listOfChannelsToNumbers) {
            println("${entry.key} - ${entry.value}.")
        }
    }

    companion object Channel{
        var listOfChannels = mutableListOf<String>("HD", "24 Док", "24 Техно", "2 x2", "5 канал", "8 канал", "Amedia 1", "Amedia 2", "Ani", "Anyday HD", "Anyday HD 3 D", "Bridge TV", "Dange TV", "EuroNews", "FOX HD", "FOX Life HD", "Gamanoid TV", "Glazella HD", "Glazella HD 3 D", "LiFE 78 HD", "LifeNews", "Luxury World (Новый)", "Mute HD", "Mute HD 3 D", "Nat Geo Wild HD", "National Geographic", "National Geographic HD", "Nickelodeon", "Paramount Comedy", "RT Documentary HD", "RTG HD (Новый)", "RTG TV", "RU TV", "Rusong TV", "Russia Today TV HD", "Russian MusicBox HD(Новый)", "Russian extreme", "Shop Show (Новый)", "TVMChannel(Новый)", "TiJi", "TopSongTV", "Travel + Adventure HD", "WBC", "World Fashion HD", "Zee TV", "Авто плюс", "Бобёр", "Время", "Дом кино", "Домашний", "ЕГЭ(Новый)", "Европа Плюс ТВ", "Живая планета", "Звезда", "Зоопарк(НОВЫЙ)", "История", "КХЛ ТВ", "Калейдоскоп", "Канал Disney", "Карусель", "Кино ТВ", "Комедия(новый)", "Красная линия", "Крым 24(новый)", "ЛДПР ТВ", "Мама", "Матч!Арена HD", "Матч!Боец", "Матч !Игра", "Матч !Наш Спорт", "Матч!ТВ", "Матч !ТВ HD", "Мир", "Мир 24", "Мир HD", "Моя планета", "Муз - ТВ", "Музыка Первого", "Мульт", "НСТ", "НТВ", "Нано ТВ", "Наука 2.0", "ОТР", "ПИК ТВ (SD)", "ПИК ТВ HD", "Парк развлечений", "Первый", "Первый HD", "Первый образовательный", "Планета HD", "Пятница !", "РАЗ ТВ", "РБК", "Рен ТВ", "Россия 1", "Россия 24", "Россия HD", "Россия К", "Русский бестселлер", "Русский детектив", " Русский роман", "СТС", "ТС Love", "Санкт - Петербург", "Сарафан ТВ", "Союз", "Спас", "Страна", "ТВ 3", "ТВ Центр", "ТМВ", "ТНТ", "ТНТ 4", "ТНТ MUSIC", "ТРО", "Твой дом (Новый)", "Телеканал 360 HD", "Телекафе", "Точка ТВ", "Три ангела", "Че", "Ю ТВ")

        fun getRandomChannels(): List<String> {
            listOfChannels.shuffled()
            return listOfChannels
        }

    }
}






