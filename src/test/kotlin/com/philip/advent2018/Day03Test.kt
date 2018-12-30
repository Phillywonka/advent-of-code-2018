package com.philip.advent2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day03Test {

    @Test
    fun `Part 1 matches input`() {
        val day03 = Day03()
        val lines = Resources.getResourceAsList("day03/day_03_part01_test_input.txt")
        assertThat(day03.part1(lines)).isEqualTo(4)
    }

    @Test
    fun `Part 2 matches input`() {
    }


}