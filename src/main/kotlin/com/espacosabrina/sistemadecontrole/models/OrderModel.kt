package com.espacosabrina.sistemadecontrole.models

import com.espacosabrina.sistemadecontrole.utils.Procedure
import com.espacosabrina.sistemadecontrole.utils.TypeOfService
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "ORDER_PAYMENT")
class OrderModel (

    @Id
    var orderId: String,
    @Column
    var orderTypeOfService: TypeOfService,
    @Column
    var orderValue: Long,
    @Column
    var orderDate: String,
    @Column
    var orderPayment: Long,
    @Column
    var orderPaymentParcels: Long,
    @Column
    var orderNumberParcels: Int,
    @Column
    var clientId: String,
    @Column
    var attendanceId: String





    )
