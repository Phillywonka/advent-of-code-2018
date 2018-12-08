package com.philip.advent2018

class Day01 {


    fun part1(inputNumbersAsStrings: List<String>): Int {

        var result = 0

        inputNumbersAsStrings.forEach { line ->
            result += line.toInt()
        }

        return result
    }

    fun part2(inputNumbersAsStrings: List<String>): Int {

        val completedFrequencyResults = emptyList<Int>().toMutableList()
        var frequencyResult = 0
        var hasReachedDuplicateFrequency = false
        var index = 0

        while (!hasReachedDuplicateFrequency) {

            if (index == inputNumbersAsStrings.size) {
                index = 0
            }

            frequencyResult += inputNumbersAsStrings[index].toInt()

            if (completedFrequencyResults.contains(frequencyResult)) {
                hasReachedDuplicateFrequency = true
            }

            completedFrequencyResults.add(frequencyResult)

            index++

        }


        return frequencyResult
    }
}

