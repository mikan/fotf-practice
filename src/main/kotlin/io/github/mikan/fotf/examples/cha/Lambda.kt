package io.github.mikan.fotf.examples.cha

// p364 A.1.1 ラムダ計算
val lambda: (Int) -> (Int) -> Int = { x -> { y -> x * y + 1 } }

fun main() {
    // 使い方
    val r = lambda(5)(6)
    println(r) // 31
}
