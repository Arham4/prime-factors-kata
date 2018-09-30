package com.gmail.arhamjsiddiqui

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class PrimeFactorsTest {
    @Test
    fun factors() {
        assertThat(factorsOf(1), `is`(emptyList()))
        assertThat(factorsOf(2), `is`(listOf(2)))
        assertThat(factorsOf(3), `is`(listOf(3)))
        assertThat(factorsOf(4), `is`(listOf(2, 2)))
        assertThat(factorsOf(5), `is`(listOf(5)))
        assertThat(factorsOf(6), `is`(listOf(2, 3)))
        assertThat(factorsOf(7), `is`(listOf(7)))
        assertThat(factorsOf(8), `is`(listOf(2, 2, 2)))
        assertThat(factorsOf(9), `is`(listOf(3, 3)))
    }

    private fun factorsOf(n: Int): List<Int> {
        var remainder = n
        val factors = mutableListOf<Int>()
        if (remainder > 1) {
            while (remainder % 2 == 0) {
                factors.add(2)
                remainder /= 2
            }
            while (remainder % 3 == 0) {
                factors.add(3)
                remainder /= 3
            }
        }
        if (remainder > 1) factors.add(remainder)
        return factors
    }
}