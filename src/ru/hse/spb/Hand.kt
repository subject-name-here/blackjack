package ru.hse.spb

class Hand {
    val cards: ArrayList<Card> = ArrayList()
    private var sum = 0
    var aces = 0

    fun addCard(card: Card) {
        sum += card.value.value
        if (card.value == CardValue.ACE) {
            aces++
        }
        cards.add(card)
    }

    fun getSum(): Int {
        while (sum > 21 && aces > 0) {
            sum -= 10
            aces--
        }
        return sum
    }

}