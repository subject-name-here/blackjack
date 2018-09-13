package ru.hse.spb

enum class CardValue(val value: Int) {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(10),
    Q(10),
    K(10)
}

enum class CardSuit {
    HEARTS, DIAMONDS, SPADES, CLUBS
}


data class Card(val value: CardValue, val suit: CardSuit) {
    override fun toString(): String {
        return "$value $suit"
    }
}

