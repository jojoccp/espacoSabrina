package com.espacosabrina.sistemadecontrole.dtos

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.*

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class SexShopDTO (
    var productCode: String,
    var productType: String,
    var purchasePrice: Long,
    var saleValue: Long,
    var gainPercentage: Long,
    var purchaseDate: Date,
    var saleDate: Date
        )