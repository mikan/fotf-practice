package io.github.mikan.fotf.examples.cha

import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BowlingGameTest {
    /** p367 A.2.1 関数を純粋に保つ */
    @Test
    fun testFP() {
        val g1 = BowlingGameFP(emptyList()).roll(5).roll(4)
        val g2 = BowlingGameFP(listOf(5)).roll(4)
        val g3 = BowlingGameFP(listOf(5, 4))
        assertEquals(g1, g2)
        assertEquals(g1, g3)
    }

    /** p369 A.2.2 可変の型を信頼しない */
    @Test
    fun testMutable() {
        val g1 = BowlingGameMutable(emptyList<Int>().toMutableList()).roll(5)
        val expected = BowlingGameMutable(emptyList<Int>().toMutableList()).roll(5).roll(4)
        assertEquals(expected, g1.roll(4))
        // assertEquals(expected, g1.roll(4))
        // 予想:BowlingGameMutable(rolls=[5, 4])
        // 実際:BowlingGameMutable(rolls=[5, 4, 4])
    }

    /** p369 A.2.2 可変の型を信頼しない */
    @Test
    fun testFPRoll2() {
        val g1 = BowlingGameFP(emptyList()).roll2(5).roll2(4)
        val g2 = BowlingGameFP(listOf(5)).roll2(4)
        val g3 = BowlingGameFP(listOf(5, 4))
        assertEquals(g1, g2)
        assertEquals(g1, g3)
    }

    /** p371 A.2.3 考えうる全ての入力に対処する */
    @Test
    fun testFPInvalidPins() {
        val game = BowlingGameFP(emptyList())
        assertThrows<IllegalStateException> { game.roll3(0) }
        assertDoesNotThrow { game.roll3(1) }
        assertEquals(game, game.roll4(0))
        assertNotEquals(game, game.roll4(1))
    }
}
