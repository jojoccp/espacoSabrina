package com.espacosabrina.sistemadecontrole.repositories

import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface AestheticAttendanceRepository: JpaRepository<AestheticAttendanceModel, Int> {


     fun findByAttendanceId(id: String): AestheticAttendanceModel
//    override fun findById(id: String): Optional<AestheticAttendanceModel>

    override fun findAll(): MutableList<AestheticAttendanceModel>

    @Query(value = "SELECT * FROM attendance INNER JOIN client ON client.client_id  = attendance.client_id WHERE  client_name = ?1", nativeQuery = true)
    fun findByClientName(clientName: String): MutableList<AestheticAttendanceModel>


    @Query(value = "SELECT * FROM attendance WHERE attendance_date = ?1", nativeQuery = true)
    fun findByAttendanceDate(attendanceDate: String): MutableList<AestheticAttendanceModel>

    fun save(attendanceModel:  AestheticAttendanceModel): AestheticAttendanceModel

    override fun delete(attendanceModel: AestheticAttendanceModel)
}