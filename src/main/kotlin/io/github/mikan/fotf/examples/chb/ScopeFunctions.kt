package io.github.mikan.fotf.examples.chb

import java.time.LocalDate

// p390 B.2.9 スコープ関数
const val currentYear = 2026
data class User(val userName: String, val dateOfBirth: LocalDate)

fun getUser(userName: String): User = User(userName, LocalDate.of(1988, 1, 1))

fun checkMajority(userName: String): Boolean {
    val user = getUser(userName)
    val age = currentYear - user.dateOfBirth.year
    return age < 21
}

fun checkMajority2(userName: String): Boolean =
    getUser(userName).run {
        currentYear - dateOfBirth.year < 21
    }

fun main() {
    println(checkMajority("mikan"))
    // Output: false
    println(checkMajority2("mikan2"))
    // Output: false
}
