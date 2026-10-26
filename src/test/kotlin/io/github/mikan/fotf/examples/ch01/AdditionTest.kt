package io.github.mikan.fotf.examples.ch01

import strikt.api.expectThat
import strikt.assertions.isEqualTo
import kotlin.test.Test

/** p39 1.5.1 最初のユニットテスト */
class AdditionTest {
    @Test
    fun `add two numbers`() {
        expectThat(5 + 6).isEqualTo(11)
        expectThat(7 + 42).isEqualTo(49)
        expectThat(9999 + 1).isEqualTo(10000)
    }
}
