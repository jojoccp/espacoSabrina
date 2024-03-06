//package com.espacosabrina.sistemadecontrole.controllers
//
//import com.espacosabrina.sistemadecontrole.models.OrderModel
//import com.espacosabrina.sistemadecontrole.services.OrderService
import com.espacosabrina.sistemadecontrole.models.AestheticAttendanceModel
import com.espacosabrina.sistemadecontrole.services.ValueControlService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/value")
class ValueControlController {

    @Autowired
    lateinit var valueControlService: ValueControlService

    @CrossOrigin
    @GetMapping
    fun getAllValues(): ResponseEntity<MutableList<AestheticAttendanceModel>> {
        println("Entrou aqui no getAllAttendances")
        return ResponseEntity.status(HttpStatus.OK).body(valueControlService.findAll())
    }

    @CrossOrigin
    @GetMapping("/{attendanceDate}")
    fun getValuesPerDate(@PathVariable attendanceDate: String): ResponseEntity<String> {
        println("Entrou aqui no getValuesPerDate")
        return ResponseEntity.status(HttpStatus.OK).body("Procedimento registrado com sucesso")
    }
}