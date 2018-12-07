package com.philip.advent2018

class Day01 {


    fun calculateSum(inputNumbersAsStrings: List<String>): Int {

        var result = 0

        inputNumbersAsStrings.forEachIndexed { index, line ->
            result += line.toInt()
        }

        return result;

    }
}

fun main(args: Array<String>) {
    val day1 = Day01()
    val fileLines = Resources.getResourceAsList("day_01_input.txt")

    print(day1.calculateSum(fileLines))
}
