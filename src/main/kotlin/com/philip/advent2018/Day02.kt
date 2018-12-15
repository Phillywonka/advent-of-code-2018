package com.philip.advent2018

class Day02 {


    fun part1(inputNumbersAsStrings: List<String>): Int {

        var amountOfTwoLetterOccurrences = 0
        var amountOfThreeLetterOccurrences = 0

        inputNumbersAsStrings.forEach { line ->

            var chars = line.toCharArray()
            var hasFoundTwoLetterOccurrences = false
            var hasFoundThreeLetterOccurrences = false

            chars.distinct().forEach { letter ->

                val count = chars.count { it == letter }

                if (count == 2 && !hasFoundTwoLetterOccurrences) {
                    amountOfTwoLetterOccurrences++
                    hasFoundTwoLetterOccurrences = true
                } else if (count == 3 && !hasFoundThreeLetterOccurrences) {
                    amountOfThreeLetterOccurrences++
                    hasFoundThreeLetterOccurrences = true
                }
            }
        }


        return amountOfTwoLetterOccurrences * amountOfThreeLetterOccurrences

    }

}

fun main(args: Array<String>) {
    print(Day02().part1(Resources.getResourceAsList("day02/part1_input.txt")))
}

