package com.espacosabrina.sistemadecontrole.extensionFunctions

import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.dtos.OrderDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.models.OrderModel
import com.espacosabrina.sistemadecontrole.utils.TypeOfService
import java.time.LocalDateTime
import javax.persistence.Column


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

    fun OrderDTO.orderDTOToModel() = OrderModel(
        idOrder = idOrder,
        typeOfService = typeOfService,
        orderValue = orderValue,
        idClient = idClient,
        orderDate = orderDate,
        orderPayment = orderPayment,
        paymentParcels = paymentParcels,
        numberParcels = numberParcels
    )

    fun OrderModel.orderModelToDTO() = OrderDTO(
        idOrder = idOrder,
        typeOfService = typeOfService,
        orderValue = orderValue,
        idClient = idClient,
        orderDate = orderDate,
        orderPayment = orderPayment,
        paymentParcels = paymentParcels,
        numberParcels = numberParcels
    )
