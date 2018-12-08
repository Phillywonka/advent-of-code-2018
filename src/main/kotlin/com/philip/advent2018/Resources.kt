package com.philip.advent2018

import java.io.File

object Resources {

    fun getResourceAsList(fileName: String): MutableList<String> {

        val filePath = javaClass.classLoader.getResource(fileName).file

        return File(filePath).readLines().toMutableList()

    }

}