package Ejercicio3

import java.io.BufferedReader
import java.io.DataInputStream
import java.io.FileInputStream
import java.io.FileReader
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.StringBuilder

fun main(){
    val f = DataInputStream(FileInputStream("datos.dat"))
    val f2 = BufferedReader(FileReader("datos.txt"))
    val output = PrintWriter(FileWriter("resumen.txt"))
    var datos = f2.readLine()
    var final: StringBuilder
    while (datos != null){
        output.write(datos + ": " + f.readFloat() + "m - " + f.readInt() + "kg.")
        datos = f2.readLine()
        //falta sacarlo por pantalla pero no me da tiempo :)
    }
    f.close()
    f2.close()
    output.close()
}