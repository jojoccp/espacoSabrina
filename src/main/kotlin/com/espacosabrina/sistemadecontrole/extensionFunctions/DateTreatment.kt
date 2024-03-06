package com.espacosabrina.sistemadecontrole.extensionFunctions

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun DateTreatment(dataRecebida:String): LocalDate{

    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val localDate = LocalDate.parse(dataRecebida, formatter)

    return localDate
}