package com.espacosabrina.sistemadecontrole.dtos

import com.espacosabrina.sistemadecontrole.utils.PaymentType
import com.espacosabrina.sistemadecontrole.utils.Procedure
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.*
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class AestheticAttendanceDTO (
    var idAttendance: Int,
    var procedure: Procedure, /*Procedure*/
    var value: Double,
    var attendanceDate: String, /*Date*/
    var clientName: String,
    var paymentType: PaymentType
        )