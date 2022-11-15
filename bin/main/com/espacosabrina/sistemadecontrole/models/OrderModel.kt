package com.espacosabrina.sistemadecontrole.models

import com.espacosabrina.sistemadecontrole.utils.TypeOfService
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "TB_ORDER")
class OrderModel (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var idOrder: Int,
    @Column
    var typeOfService: TypeOfService,
    @Column
    var orderValue: Long,
    @Column
    var idClient: Int,
    @Column
    var orderDate: LocalDateTime,
    @Column
    var orderPayment: Long,
    @Column
    var paymentParcels: Long,
    @Column
    var numberParcels: Int

    )
