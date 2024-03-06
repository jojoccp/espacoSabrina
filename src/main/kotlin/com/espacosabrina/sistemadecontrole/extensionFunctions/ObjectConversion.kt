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
        clientId = clientId,
        clientName = clientName,
        clientCellphone = clientCellphone
    )

    fun ClientModel.clientModeltoDTO() = ClientDTO(
        clientId = clientId,
        clientName = clientName,
        clientCellphone = clientCellphone
    )

    fun OrderDTO.orderDTOToModel() = OrderModel(
        orderId = orderId,
        orderTypeOfService = orderTypeOfService,
        orderValue = orderValue,
        orderDate = orderDate,
        orderPayment = orderPayment,
        orderPaymentParcels = orderPaymentParcels,
        orderNumberParcels = orderNumberParcels,
        clientId = clientId,
        attendanceId = attendanceId
    )

    fun OrderModel.orderModelToDTO() = OrderDTO(
        orderId = orderId,
        orderTypeOfService = orderTypeOfService,
        orderValue = orderValue,
        orderDate = orderDate,
        orderPayment = orderPayment,
        orderPaymentParcels = orderPaymentParcels,
        orderNumberParcels = orderNumberParcels,
        clientId = clientId,
        attendanceId = attendanceId
    )

    fun AestheticAttendanceDTO.attendanceDTOToModel() = AestheticAttendanceModel(
        attendanceId = attendanceId,
        attendanceProcedure = attendanceProcedure,
        attendanceDate = attendanceDate,
        attendancePaymentType = attendancePaymentType,
        clientId = clientId
    )

    fun AestheticAttendanceModel.attendanceModeltoDTO() = AestheticAttendanceDTO(
        attendanceId = attendanceId,
        attendanceProcedure = attendanceProcedure,
        attendanceDate = attendanceDate,
        attendancePaymentType = attendancePaymentType,
        clientId = clientId
    )
