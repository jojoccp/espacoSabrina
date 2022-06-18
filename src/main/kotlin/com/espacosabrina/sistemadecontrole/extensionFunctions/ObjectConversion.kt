package com.espacosabrina.sistemadecontrole.extensionFunctions

import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel


    fun ClientDTO.clientDTOToModel() = ClientModel(
        idClient = idClient,
        clientName = clientName,
        clientCellphone = clientCellphone
    )

    fun ClientModel.clientModeltoDTO() = ClientDTO(
        idClient = idClient,
        clientName = clientName,
        clientCellphone = clientCellphone
    )
