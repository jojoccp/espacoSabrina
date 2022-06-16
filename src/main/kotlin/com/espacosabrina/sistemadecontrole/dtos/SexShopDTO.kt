package com.espacosabrina.sistemadecontrole.dtos

import java.util.*

data class SexShopDTO (
    var productCode: String,
    var productType: String,
    var purchasePrice: Long,
    var saleValue: Long,
    var gainPercentage: Long,
    var purchaseDate: Date,
    var saleDate: Date
        )