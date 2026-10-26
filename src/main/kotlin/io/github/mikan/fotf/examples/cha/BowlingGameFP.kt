package io.github.mikan.fotf.examples.cha

/** p367 1.2.1 関数を純粋に保つ */
data class BowlingGameFP(val rolls: List<Int>) {
    fun roll(pins: Int): BowlingGameFP = BowlingGameFP(rolls + pins)
}
