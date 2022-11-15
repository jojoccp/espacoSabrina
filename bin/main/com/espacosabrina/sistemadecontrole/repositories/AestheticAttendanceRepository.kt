package com.espacosabrina.sistemadecontrole.repositories

import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.models.ClientModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface AestheticAttendanceRepository: JpaRepository<AestheticAttendanceModel, Int> {

    override fun findById(id: Int): Optional<AestheticAttendanceModel>

    override fun findAll(): MutableList<AestheticAttendanceModel>

    @Query(value = "SELECT * FROM tb_attendance WHERE client_name = ?1", nativeQuery = true)
    fun findByClientName(clientName: String): MutableList<AestheticAttendanceModel>

    @Query(value = "SELECT * FROM tb_attendance WHERE attendance_date = ?1", nativeQuery = true)
    fun findByAttendanceDate(attendanceDate: String): MutableList<AestheticAttendanceModel>

    fun save(attendanceModel:  AestheticAttendanceModel): AestheticAttendanceModel

    override fun delete(attendanceModel: AestheticAttendanceModel)
}