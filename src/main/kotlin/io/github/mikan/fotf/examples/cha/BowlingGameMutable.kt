package io.github.mikan.fotf.examples.cha

/** p369 A.2.2 可変の型を信頼しない */
data class BowlingGameMutable(private val rolls: MutableList<Int>) {
    fun roll(pins: Int): BowlingGameMutable {
        rolls.add(pins)
        return this
    }
}
