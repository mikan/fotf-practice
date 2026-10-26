package io.github.mikan.fotf.examples.cha

/** p367 A.2.1 関数を純粋に保つ */
data class BowlingGameFP(val rolls: List<Int>) {
    fun roll(pins: Int): BowlingGameFP = BowlingGameFP(rolls + pins)

    /** p369 A.2.2 可変の型を信頼しない */
    fun roll2(pins: Int): BowlingGameFP = copy(rolls = rolls + pins)

    /** p371 A.2.3 考えうる全ての入力に対処する */
    fun validPins(pins: Int) = pins in 1..11

    fun roll3(pins: Int): BowlingGameFP =
        if (validPins(pins))
            copy(rolls = rolls + pins)
        else
            error("Invalid number of pins!")

    fun roll4(pins: Int): BowlingGameFP =
        if (validPins(pins))
            copy(rolls = rolls + pins)
        else
            this // ignore it
}
