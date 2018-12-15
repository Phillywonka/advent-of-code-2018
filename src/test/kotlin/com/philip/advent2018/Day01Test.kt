package com.philip.advent2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Test {


    @Test
    fun `Part 1 matches input`() {
        val day01 = Day01()
        val lines = Resources.getResourceAsList("day01/day_01_test_input.txt")
        assertThat(day01.part1(lines)).isEqualTo(4)
    }

    @Test
    fun `Part 2 matches input`() {
        val day01 = Day01()
        val lines = Resources.getResourceAsList("day01/day_01_test_input.txt")
        assertThat(day01.part2(lines)).isEqualTo(5)
    }

}