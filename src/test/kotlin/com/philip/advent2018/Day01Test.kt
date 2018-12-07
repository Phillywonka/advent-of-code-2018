package com.philip.advent2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun `Part 1 matches input`() {
        val day01 = Day01()
        val lines = Resources.getResourceAsList("day_01_test_input.txt")
        assertThat(day01.calculateSum(lines)).isEqualTo(0)
    }
}