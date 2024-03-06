package com.espacosabrina.sistemadecontrole.services

import com.espacosabrina.sistemadecontrole.dtos.AestheticAttendanceDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.attendanceDTOToModel
import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.repositories.AestheticAttendanceRepository
import org.slf4j.Logger
import org.springframework.stereotype.Service

@Service
class AestheticAttendanceService(private val repository: AestheticAttendanceRepository, val logger: Logger) {

    fun findAll(): MutableList<AestheticAttendanceModel> {
        return repository.findAll()
    }

    fun save(attendanceDTO: AestheticAttendanceDTO): AestheticAttendanceDTO {
        var attendanceModel = attendanceDTO.attendanceDTOToModel()

        repository.save(attendanceModel)
        return attendanceDTO
    }

    fun findByClientName(clientName: String): MutableList<AestheticAttendanceModel> {
        return repository.findByClientName(clientName)
    }

    fun findByAttendanceDate(attendanceDate: String): MutableList<AestheticAttendanceModel> {
        return repository.findByAttendanceDate(attendanceDate)
    }

    fun findAttendanceById(attendanceId: String): AestheticAttendanceModel {
        return repository.findByAttendanceId(attendanceId)
    }

    fun delete(attendanceDTO: AestheticAttendanceDTO) {
        var attendanceModel = attendanceDTO.attendanceDTOToModel()
        repository.delete(attendanceModel)
        logger.info("AestheticAttendance - attendance with id: ${attendanceDTO.attendanceId} was deleted.")
    }
}