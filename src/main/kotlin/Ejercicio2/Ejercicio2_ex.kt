package Ejercicio2

import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.io.FileReader

fun main (args: Array<String>){
    val a_json = FileReader("VariacionPoblacional.json")
    val arrel = JSONTokener(a_json).nextValue() as JSONArray
    val nombre = arrel.getJSONObject(0)
    val data = arrel.getJSONObject(0).getJSONArray("Data")
    var variacioTotal = 0

    for (e in arrel){
        val pob = e as JSONObject
        if (nombre.equals("Castelló")){
            for (f in data){
                val pob1 = f as JSONObject
                println("" + f.get("NombrePeriodo") + "--->" + f.get("Valor"))
                var p = f.get("Valor").toString()
                variacioTotal += p.toInt()
            }
        }
    }
    println("Variacion total: $variacioTotal")
}