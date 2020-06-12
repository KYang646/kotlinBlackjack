class Card(val suit: Char, val pip: String) {

//    val suits: Array<String> = arrayOf(
//            "♥", "♠", "♦", "♣")

//    val someCard: Array<String> = arrayOf("Ace", "2", "3", "4", "5", "6", "7", "8",
//                                            "9", "10", "Jack", "Queen", "King")
}

fun main() {
    var deck = createDeck()
    var hand = dealHand(number: 2, deck)
    var total = evaluateHand(hand)
    printResults(hand, total)
}

fun createDeck() : MutableSet<Card> {
    var suits = listOf("\u2663","\u2660","\u2666","\u2665")
    println(suits)
    var pips = listOf("1","2","3","4","5","6","7","8","9","10","J","Q","K")
    var deck: MutableSet<Card> = mutableSetOf()
        for(suit in suits) {
            for(pip in pips) {
                deck.add(Card(suit, pip))
            }
        }
    return deck
}