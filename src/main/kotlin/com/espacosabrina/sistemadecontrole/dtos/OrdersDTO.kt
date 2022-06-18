package com.espacosabrina.sistemadecontrole.dtos

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.Date

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class OrdersDTO (
    var idOrder: Int,
    var orderValue: Long,
    var idClient: Int,
    var orderDate: Date,
    var orderPayment: List<Date>,
    var paymentParcels: List<Long>
        )