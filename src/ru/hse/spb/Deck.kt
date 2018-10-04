package ru.hse.spb

class Deck {
    val cards: MutableList<Card>

    init {
        val cardsList = emptyList<Card>().toMutableList()

        for (value in CardValue.values()) {
            for (suit in CardSuit.values()) {
                cardsList.add(Card(value, suit))
            }
        }

        cardsList.shuffle()
        cards = cardsList
    }

    fun drawCard(): Card {
        return cards.removeAt(cards.lastIndex)
    }
}