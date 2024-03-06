package com.espacosabrina.sistemadecontrole.repositories

import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.models.ValueControlModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ValueControlRepository: JpaRepository<AestheticAttendanceModel, Int> {


    override fun findAll(): MutableList<AestheticAttendanceModel>

    @Query(value = "SELECT * FROM tb_attendance WHERE attendance_date = ?1", nativeQuery = true)
    fun findByAttendanceDate(attendanceDate: String): MutableList<AestheticAttendanceModel>

}