data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)

// toString(), hashCode(), equals(), copy()
class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)

fun main() {
    val ticketA = Ticket("tway", "minhyukKim", "2023-08-25", 1)
    val ticketB = TicketNormal("tway", "minhyukKim", "2023-08-25", 1)

    println(ticketA)
    println(ticketB)
}
