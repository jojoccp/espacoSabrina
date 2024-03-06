package com.espacosabrina.sistemadecontrole.dtos

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.UUID

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class ClientDTO (
        var idClient: String = "CLI_" + UUID.randomUUID().toString().uppercase(),
        var clientName: String,
        var clientCellphone: String
        )