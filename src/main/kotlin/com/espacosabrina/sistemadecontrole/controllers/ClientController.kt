package com.espacosabrina.sistemadecontrole.controllers

//import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*

@Controller
@RequestMapping("/clients")
class ClientController {

    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun getAllClients(): ResponseEntity<MutableList<ClientModel>> {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findAll())
    }

    @GetMapping("/{id}")
    fun getClient(@PathVariable id: Int): ClientDTO {
        return clientService.findById(id)
    }

    @PostMapping
    fun createClient(@RequestBody clientDTO: ClientDTO): ClientDTO {
        return clientService.save(clientDTO)
    }

//    @PutMapping("/{id}")
//    fun updateClient(@PathVariable id: Int, @RequestBody clientDTO: ClientDTO): ClientDTO{
//        var clientFound = clientService.findById(id)
//
//        var encontred = clientService.findById(id).orElseThrow{ RuntimeException("Esse registro não foi encontrado")}
//
//        encontred.apply {
//            this.clientName = clientModel.clientName
//            this.clientCellphone = clientModel.clientCellphone
//        }
//
//        return ResponseEntity.ok(clientService.save(clientModel))
//    }

//    @DeleteMapping("/{id}")
//    fun deleteClient(@PathVariable id: Int): ResponseEntity.BodyBuilder {
//        var clientFound = clientService.findById(id).orElseThrow{ RuntimeException("Esse registro não foi encontrado")}
//
//        clientService.delete(clientFound)
//
//        return ResponseEntity.status(HttpStatus.OK)
//    }
}