package com.philip.advent2018

class Day03 {

    fun part1(inputNumbersAsStrings: List<String>): Int {

        val claims = emptyList<Claim>().toMutableList()
        inputNumbersAsStrings.forEach { inputString ->
            val input = inputString.split(' ')
            val id = input[0].removePrefix("#").toInt()

            val coordinates = input[2].split(',')
            val area = input[3].split('x')

            val left = coordinates[0].toInt()
            val top = coordinates[1].removeSuffix(":").toInt()
            val width = area[0].toInt()
            val height = area[1].toInt()

            val claim = Claim(id, left, top, width, height)
            claims.add(claim)
        }

        val totalAreaOverlapped = claims
            .flatMap { it.area() }  // List<Pair<Int,Int>>
            .groupingBy { it }
            .eachCount()            // Map<Pair<Int,Int>, Int>
            .count { it.value > 1 }

        return totalAreaOverlapped
    }
}

data class Claim(val id: Int, val left: Int, val top: Int, val width: Int, val height: Int) {
    fun area(): List<Pair<Int, Int>> =
        (0 + left until width + left).flatMap { w ->
            (0 + top until height + top).map { h ->
                Pair(w, h)
            }
        }
}

fun main(args: Array<String>) {
    print(Day03().part1(Resources.getResourceAsList("day03/part1_input.txt")))
}

