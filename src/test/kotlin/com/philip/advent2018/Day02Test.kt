package com.philip.advent2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day02Test {


    @Test
    fun `Part 1 matches input`() {
        val day02 = Day02()
        val lines = Resources.getResourceAsList("day02/day_02_test_input.txt")
        assertThat(day02.part1(lines)).isEqualTo(4)
    }

}