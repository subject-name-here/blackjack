package ru.hse.spb

import org.junit.Assert.*
import org.junit.Test

class DeckTest {

    @Test
    fun testGetCards() {
        val deck = Deck()
        assertEquals(52, deck.cards.size)
    }
}