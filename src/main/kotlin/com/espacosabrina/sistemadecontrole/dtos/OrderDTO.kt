package com.espacosabrina.sistemadecontrole.dtos

import com.espacosabrina.sistemadecontrole.utils.TypeOfService
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.time.LocalDateTime
import java.util.Date

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class OrderDTO (
    var idOrder: Int,
    var typeOfService: TypeOfService,
    var orderValue: Long,
    var idClient: Int,
    var orderDate: LocalDateTime,
    var orderPayment: Long,
    var paymentParcels: Long,
    var numberParcels: Int
        )