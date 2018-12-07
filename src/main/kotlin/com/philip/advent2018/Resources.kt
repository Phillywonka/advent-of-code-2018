package com.philip.advent2018

import java.io.File

object Resources {

    fun getResourceAsList(fileName: String): MutableList<String> {

        val filePath = javaClass.classLoader.getResource(fileName).file

//        val fileLines = mutableListOf<String>()

        return File(filePath).readLines().toMutableList()

//            useLines { lines -> fileLines.addAll(lines) }

//        return fileLines
    }

}