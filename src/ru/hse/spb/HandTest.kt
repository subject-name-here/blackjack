package ru.hse.spb

import org.junit.Assert.*
import org.junit.Test

class HandTest {
    @Test
    fun test1() {
        val hand = Hand()
        assertEquals(emptyList<Card>(), hand.cards)
    }

    @Test
    fun test2() {
        val hand = Hand()
        val card = Card(CardValue.TWO, CardSuit.HEARTS)
        hand.addCard(card)

        assertEquals(listOf(card), hand.cards)
    }

    @Test
    fun test3() {
        val hand = Hand()
        val cards = listOf(
                Card(CardValue.TWO, CardSuit.HEARTS),
                Card(CardValue.ACE, CardSuit.CLUBS)
        )
        cards.forEach { hand.addCard(it) }
        assertEquals(13, hand.getSum())
    }

    @Test
    fun test4() {
        val hand = Hand()
        val cards = listOf(
                Card(CardValue.K, CardSuit.HEARTS),
                Card(CardValue.NINE, CardSuit.HEARTS),
                Card(CardValue.ACE, CardSuit.CLUBS)
        )
        cards.forEach { hand.addCard(it) }
        assertEquals(20, hand.getSum())
    }

    @Test
    fun test5() {
        val hand = Hand()
        val cards = listOf(
                Card(CardValue.K, CardSuit.HEARTS),
                Card(CardValue.Q, CardSuit.HEARTS),
                Card(CardValue.K, CardSuit.CLUBS)
        )
        cards.forEach { hand.addCard(it) }
        assertEquals(30, hand.getSum())
    }
}