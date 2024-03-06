package com.espacosabrina.sistemadecontrole.services

import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.repositories.AestheticAttendanceRepository
import com.espacosabrina.sistemadecontrole.repositories.ValueControlRepository
import org.springframework.stereotype.Service

@Service
class ValueControlService(private val repository: ValueControlRepository) {


    fun findAll(): MutableList<AestheticAttendanceModel> {
        return repository.findAll()
    }

    fun findByDate(attendanceDate: String): Double {
        val attendances = repository.findByAttendanceDate(attendanceDate)

        var sumOfPayments = 0.0



        return sumOfPayments
    }
}