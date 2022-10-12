package com.espacosabrina.sistemadecontrole.extensionFunctions

import com.espacosabrina.sistemadecontrole.dtos.AestheticAttendanceDTO
import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.dtos.OrderDTO
import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.models.OrderModel
import com.espacosabrina.sistemadecontrole.utils.Procedure
import com.espacosabrina.sistemadecontrole.utils.TypeOfService
import java.time.LocalDateTime
import java.util.*
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

    fun AestheticAttendanceDTO.attendanceDTOToModel() = AestheticAttendanceModel(
        idAttendance = idAttendance,
        procedure = procedure,
        value = value,
        attendanceDate = attendanceDate,
        clientName = clientName,
        paymentType = paymentType
    )

    fun AestheticAttendanceModel.attendanceModeltoDTO() = AestheticAttendanceDTO(
        idAttendance = idAttendance,
        procedure = procedure,
        value = value,
        attendanceDate = attendanceDate,
        clientName = clientName,
        paymentType = paymentType
    )
