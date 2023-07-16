package com.initial.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import kotlin.NumberFormatException

fun parseIntOrThrow(str : String): Int{
    try{
        return str.toInt()
    }catch (e: NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가아님")
    }
}

fun parseIntOrThrowV2(str :String): Int?{
    return try{
        str.toInt()
    } catch (e: NumberFormatException){
        null
    }
}

/**
 * 코틀린은 checked Exception과
 * unchecked Exception 모두 unchecked exception으로 간
 */
fun readFile(){
    val currentFile = File(".")
    val file = File(currentFile.absoluteFile,"/a.txt")
    val reader = BufferedReader(FileReader(file))
    print(reader.readLine())
    reader.close()
}

fun readFile(path: String){
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }

}