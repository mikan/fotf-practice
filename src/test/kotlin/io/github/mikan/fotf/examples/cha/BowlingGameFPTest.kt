package io.github.mikan.fotf.examples.cha

import kotlin.test.Test
import kotlin.test.assertEquals

/** p367 A.2.1 関数を純粋に保つ */
class BowlingGameFPTest {
    @Test
    fun test1() {
        val g1 = BowlingGameFP(emptyList()).roll(5).roll(4)
        val g2 = BowlingGameFP(listOf(5)).roll(4)
        val g3 = BowlingGameFP(listOf(5, 4))
        assertEquals(g1, g2)
        assertEquals(g1, g3)
    }
}
