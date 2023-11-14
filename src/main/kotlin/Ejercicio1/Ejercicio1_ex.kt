package Ejercicio1

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

fun main() {
    println("Introdueix una ruta: ")
    val input = BufferedReader(InputStreamReader(System.`in`)).readLine()
    val ruta = input.toString()
    val f = File(input)
    if (ruta != null) {
        val s = "Llista de fitxers i directoris de la ruta" + f.path
        println(" ")
        println(s)
        println("-".repeat(s.length))

        loopNumbers(f)
    } else {
        println("Entrada no valida. Introduix un numero válid.")
        println("")
    }

}


fun loopNumbers(f: File) {
    val currentFile = f
    var numFiles = 0
    var numDir = 0
    var totalMemory = 0L
    var maxSize = 0L
    var nameFile: String? = null
    for (e in currentFile.walk()) {
        if (e.isFile) {
            numFiles++
            totalMemory += e.length()
            if (e.length() > maxSize) {
                maxSize = e.length()
                nameFile = e.name
            }
        } else if (e.isDirectory) {
            numDir++
        }
    }
    println("Numero de ficheros: $numFiles")
    println("Numero de directorios: $numDir")
    println("Tamaño total de los ficheros: $totalMemory")
    println("El fichero mas grande es: $nameFile, con $maxSize bytes")
    main()
}
