package com.espacosabrina.sistemadecontrole.dtos

import com.espacosabrina.sistemadecontrole.utils.Procedure
import com.espacosabrina.sistemadecontrole.utils.TypeOfService
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.time.LocalDateTime
import java.util.Date
import java.util.UUID

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class OrderDTO (
    var orderId: String = "ORD_" + UUID.randomUUID().toString().uppercase(),
    var orderTypeOfService: TypeOfService,
    var orderValue: Long,
    var orderDate: String,
    var orderPayment: Long,
    var orderPaymentParcels: Long,
    var orderNumberParcels: Int,
    var clientId: String,
    var attendanceId: String
        )