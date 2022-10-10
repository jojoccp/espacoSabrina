package com.espacosabrina.sistemadecontrole.models

import com.espacosabrina.sistemadecontrole.utils.Procedure
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "TB_ATTENDANCE")
data class AestheticAttendanceModel (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var idAttendance: Int,
    @Column
    var procedure: Procedure,
    @Column
    var value: Double,
    @Column
    var attendanceDate: Date,
    @Column
    var clientName: String
        )