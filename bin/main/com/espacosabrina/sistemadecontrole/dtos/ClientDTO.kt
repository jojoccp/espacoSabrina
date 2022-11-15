package com.espacosabrina.sistemadecontrole.dtos

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class ClientDTO (
    var idClient: Int,
    var clientName: String,
    var clientCellphone: String
        )