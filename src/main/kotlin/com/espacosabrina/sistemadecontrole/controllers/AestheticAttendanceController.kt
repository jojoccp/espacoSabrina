package com.espacosabrina.sistemadecontrole.controllers

import com.espacosabrina.sistemadecontrole.dtos.AestheticAttendanceDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.attendanceModeltoDTO
import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.services.AestheticAttendanceService
import org.slf4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/attendance")
class AestheticAttendanceController(val logger: Logger) {

    @Autowired
    lateinit var attendanceService: AestheticAttendanceService

    @CrossOrigin
    @GetMapping
    fun getAllAttendances(): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        logger.info("AestheticAttendance - getting all attendances")
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findAll())
    }

    @CrossOrigin
    @GetMapping("/byClientName/{clientName}")
    fun getAttendancesPerClient(@PathVariable clientName: String): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        logger.info("AestheticAttendance - getting attendances by client name: $clientName")
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findByClientName(clientName))
    }

    @CrossOrigin
    @GetMapping("/byAttendanceDate/{attendanceDate}")
    fun getAttendancesPerDate(@PathVariable attendanceDate: String): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        logger.info("AestheticAttendance - getting attendances by date: $attendanceDate")
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findByAttendanceDate(attendanceDate))
    }

    @CrossOrigin
    @GetMapping("/byAttendanceId/{attendanceId}")
    fun getAttendanceById(@PathVariable attendanceId: String): ResponseEntity<AestheticAttendanceModel> {
        logger.info("AestheticAttendance - getting attendance by id: $attendanceId")
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findAttendanceById(attendanceId))
    }

    @CrossOrigin
    @PostMapping
    fun createAttendance(@RequestBody attendanceDTO: AestheticAttendanceDTO): ResponseEntity<String> {
        logger.info("AestheticAttendance: creating attendance")
        attendanceService.save(attendanceDTO)
        return ResponseEntity.status(HttpStatus.OK).body("Procedimento registrado com sucesso")
    }

    @DeleteMapping("/{attendanceId}")
    fun deleteAttendance(@PathVariable attendanceId: String): ResponseEntity<String> {
        logger.info("AestheticAttendance - deleting attendance with id: $attendanceId")
        var attendanceFound = attendanceService.findAttendanceById(attendanceId)

        attendanceService.delete(attendanceFound.attendanceModeltoDTO())

        return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso")
    }
}