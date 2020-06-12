class Card {

//    val suits: Array<String> = arrayOf(
//            "♥", "♠", "♦", "♣")

    val someCard: Array<String> = arrayOf("Ace", "2", "3", "4", "5", "6", "7", "8",
                                            "9", "10", "Jack", "Queen", "King")
}

fun main() {
    var deck = createDeck()
    var hand = dealHand(number: 2, deck)
    var total = evaluateHand(hand)
    printResults(hand, total)
}

fun createDeck() : MutableSet<Card> {
    var suits = listOf("\u2663","\u2660","\u2666","\u2665")
    

}