package com.espacosabrina.sistemadecontrole.models

import com.espacosabrina.sistemadecontrole.utils.PaymentType
import com.espacosabrina.sistemadecontrole.utils.Procedure
import org.hibernate.annotations.GenericGenerator
import java.time.LocalDate
import java.util.Date
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "ATTENDANCE")
data class AestheticAttendanceModel (

    @Id
    var attendanceId: String,
    @Column
    var attendanceDate: String,
    @Column
    var attendancePaymentType: PaymentType,
    @Column
    var attendanceProcedure: Procedure,
    @Column
    var clientId: String
        )