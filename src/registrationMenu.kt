/**
 * Добавления билета в listTicket
 */
fun addTicket(listTicket: MutableList<Any>) {
    println("Введите данные, для покупки билета:")
    print("Имя -> ")
    val userName = readLine()!!
    if (userName.isBlank()) {
        println("Пустой ввод!")
        return
    } else {
        listTicket.add(userName)
    }
    print("Возвраст -> ")
    val userAge = readLine()!!.toIntOrNull()
    if (userAge == null || userAge <= 0 || userAge > 95) {
        println("Ошибка!")
        return
    } else {
        listTicket.add(userAge)
    }

    print("Город отправления -> ")
    val userDepartures = readLine()!!
    if (userDepartures.isBlank()) {
        println("Пустой ввод!")
    } else {
        listTicket.add(userDepartures)
    }

    print("Город прибытия -> ")
    val userArrival = readLine()!!
    if (userArrival.isBlank()) {
        println("Пустой ввод!")
    } else {
        listTicket.add(userArrival)
    }
    println("Ваш билет добавлен в раздел -> Мои!")
}


/**
 * Выводит билеты, добавленные в listTicket
 */
fun myTicket(listTicket: MutableList<Any>) {
    if (listTicket.isEmpty()) {
        println("У вас нету билетов!")
        return
    }
    println("Ваши билеты: $listTicket")
}