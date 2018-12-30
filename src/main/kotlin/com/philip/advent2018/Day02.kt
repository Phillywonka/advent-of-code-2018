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

    fun part2(inputNumbersAsStrings: List<String>): String {

        var charPosition = 0
        var resultString = ""

        loop1@ for (line in inputNumbersAsStrings) {

            val sameSizeLines = inputNumbersAsStrings.filter { it.length == line.length && it != line }

            loop2@ for (sameSizeLine in sameSizeLines) {

                var count = 0

                for (( index, letter ) in sameSizeLine.withIndex()) {

                    if (line[index] != letter) {
                        charPosition = index
                        count++

                        if (count > 1)
                        {
                            break
                        }
                    }


                    if (index == line.length - 1 && count == 1) {
                        resultString = sameSizeLine.removeRange(charPosition, charPosition + 1)
                        break@loop1
                    }
                }
            }
        }

        return resultString
    }
}

