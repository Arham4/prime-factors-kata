package com.gmail.arhamjsiddiqui

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class PrimeFactorsTest {
    @Test
    fun factors() {
        assertThat(factorsOf(1), `is`(emptyList()))
        assertThat(factorsOf(2), `is`(listOf(2)))
    }

    private fun factorsOf(n: Int): List<Int> {
        val factors = mutableListOf<Int>()
        if (n > 1) factors.add(2)
        return factors
    }
}