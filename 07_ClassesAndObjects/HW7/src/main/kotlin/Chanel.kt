object Chanel {
    var listOfChannels = mutableListOf<String>("HD", "24 Док", "24 Техно", "2x2", "5 канал", "8 канал", "Amedia 1", "Amedia 2", "Ani", "Anyday HD", "Anyday HD 3 D", "Bridge TV", "Dange TV", "EuroNews", "FOX HD", "FOX Life HD", "Gamanoid TV", "Glazella HD", "Glazella HD 3 D", "LiFE 78 HD", "LifeNews", "Luxury World (Новый)", "Mute HD", "Mute HD 3 D", "Nat Geo Wild HD", "National Geographic", "National Geographic HD", "Nickelodeon", "Paramount Comedy", "RT Documentary HD", "RTG HD (Новый)", "RTG TV", "RU TV", "Rusong TV", "Russia Today TV HD", "Russian MusicBox HD(Новый)", "Russian extreme", "Shop Show (Новый)", "TVMChannel(Новый)", "TiJi", "TopSongTV", "Travel + Adventure HD", "WBC", "World Fashion HD", "Zee TV", "Авто плюс", "Бобёр", "Время", "Дом кино", "Домашний", "ЕГЭ(Новый)", "Европа Плюс ТВ", "Живая планета", "Звезда", "Зоопарк(НОВЫЙ)", "История", "КХЛ ТВ", "Калейдоскоп", "Канал Disney", "Карусель", "Кино ТВ", "Комедия(новый)", "Красная линия", "Крым 24(новый)", "ЛДПР ТВ", "Мама", "Матч!Арена HD", "Матч!Боец", "Матч !Игра", "Матч !Наш Спорт", "Матч!ТВ", "Матч !ТВ HD", "Мир", "Мир 24", "Мир HD", "Моя планета", "Муз - ТВ", "Музыка Первого", "Мульт", "НСТ", "НТВ", "Нано ТВ", "Наука 2.0", "ОТР", "ПИК ТВ (SD)", "ПИК ТВ HD", "Парк развлечений", "Первый", "Первый HD", "Первый образовательный", "Планета HD", "Пятница !", "РАЗ ТВ", "РБК", "Рен ТВ", "Россия 1", "Россия 24", "Россия HD", "Россия К", "Русский бестселлер", "Русский детектив", " Русский роман", "СТС", "ТС Love", "Санкт - Петербург", "Сарафан ТВ", "Союз", "Спас", "Страна", "ТВ 3", "ТВ Центр", "ТМВ", "ТНТ", "ТНТ 4", "ТНТ MUSIC", "ТРО", "Твой дом (Новый)", "Телеканал 360 HD", "Телекафе", "Точка ТВ", "Три ангела", "Че", "Ю ТВ")

    fun getRandomChannels(channelQuantity: Int): List<String> {
        listOfChannels.shuffled()
        val listOfChannelEach = listOfChannels.shuffled().take(channelQuantity)
        return listOfChannelEach
    }
}