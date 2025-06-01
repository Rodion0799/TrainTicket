fun main() {
    val listTicket = mutableListOf<Any>()
    while (true) {
        println("1. Добавить билет\n2. Мои билеты")
        print("Введите ID -> ")
        val userIdTicket = readLine()!!.toIntOrNull()
        if (userIdTicket == null || userIdTicket !in (1..2)) {
            println("Ошибка!")
            return
        }
        when (userIdTicket) {
            1 -> addTicket(listTicket)
            2 -> myTicket(listTicket)
        }
    }
}