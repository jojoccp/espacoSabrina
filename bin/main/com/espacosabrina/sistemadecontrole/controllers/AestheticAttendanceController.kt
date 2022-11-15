package com.espacosabrina.sistemadecontrole.controllers

import com.espacosabrina.sistemadecontrole.dtos.AestheticAttendanceDTO
import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.services.AestheticAttendanceService
import com.espacosabrina.sistemadecontrole.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*

@Controller
@RequestMapping("/attendance")
class AestheticAttendanceController {

    @Autowired
    lateinit var attendanceService: AestheticAttendanceService

    @CrossOrigin
    @GetMapping
    fun getAllAttendances(): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        println("####teeeestando")
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findAll())
    }

    @CrossOrigin
    @GetMapping("/byClientName/{clientName}")
    fun getAttendancesPerClient(@PathVariable clientName: String): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findByClientName(clientName))
    }

    @CrossOrigin
    @GetMapping("/byAttendanceDate/{attendanceDate}")
    fun getAttendancesPerDate(@PathVariable attendanceDate: String): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findByAttendanceDate(attendanceDate))
    }

    @CrossOrigin
    @GetMapping("/testget")
    fun testGet(): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        return ResponseEntity.status(HttpStatus.OK).body(attendanceService.findAll())
    }

    @CrossOrigin
    @PostMapping
    fun createAttendance(@RequestBody attendanceDTO: AestheticAttendanceDTO): ResponseEntity<String> {
        attendanceService.save(attendanceDTO)
        return ResponseEntity.status(HttpStatus.OK).body("Procedimento registrado com sucesso")
    }
}