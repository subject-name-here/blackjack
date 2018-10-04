package ru.hse.spb

import org.junit.Assert.*
import org.junit.Test
import ru.hse.spb.Card
import ru.hse.spb.CardSuit
import ru.hse.spb.CardValue

class CardTest {
    @Test
    fun testCardGetValue1() {
        val c: Card = Card(CardValue.K, CardSuit.HEARTS)
        assertEquals(CardValue.K, c.value)
    }

    @Test
    fun testCardGetValue2() {
        val c: Card = Card(CardValue.TWO, CardSuit.HEARTS)
        assertEquals(CardValue.TWO, c.value)
    }

    @Test
    fun testCardGetSuit() {
        val c: Card = Card(CardValue.TWO, CardSuit.HEARTS)
        assertEquals(CardSuit.HEARTS, c.suit)
    }
}