package com.espacosabrina.sistemadecontrole.dtos

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.Date

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class RommanelDTO (
        var productCode: String,
        var jewelry: String,
        var purchasePrice: Long,
        var saleValue: Long,
        var gainPercentage: Long,
        var purchaseDate: Date,
        var saleDate: Date
        )