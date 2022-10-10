package com.espacosabrina.sistemadecontrole.repositories

import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.models.ClientModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AestheticAttendanceRepository: JpaRepository<AestheticAttendanceModel, Int> {

    override fun findById(id: Int): Optional<AestheticAttendanceModel>

    override fun findAll(): MutableList<AestheticAttendanceModel>

    fun save(attendanceModel:  AestheticAttendanceModel): AestheticAttendanceModel

    override fun delete(attendanceModel: AestheticAttendanceModel)
}