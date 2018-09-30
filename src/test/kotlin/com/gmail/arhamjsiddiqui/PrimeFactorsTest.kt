package com.gmail.arhamjsiddiqui

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class PrimeFactorsTest {
    @Test
    fun factors() {
        assertThat(factorsOf(1), `is`(emptyList()))
    }

    private fun factorsOf(n: Int): List<Int> {
        return emptyList()
    }
}