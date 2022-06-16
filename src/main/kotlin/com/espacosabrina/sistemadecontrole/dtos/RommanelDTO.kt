package com.espacosabrina.sistemadecontrole.dtos

import java.util.Date

data class RommanelDTO (
        var productCode: String,
        var jewelry: String,
        var purchasePrice: Long,
        var saleValue: Long,
        var gainPercentage: Long,
        var purchaseDate: Date,
        var saleDate: Date
        )