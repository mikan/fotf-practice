package io.github.mikan.fotf.examples.cha

/** p367 A.2.1 関数を純粋に保つ */
data class BowlingGameFP(val rolls: List<Int>) {
    fun roll(pins: Int): BowlingGameFP = BowlingGameFP(rolls + pins)
    /** p.369 A.2.2 可変の型を信頼しない */
    fun roll2(pins: Int): BowlingGameFP = copy(rolls = rolls + pins)
}
