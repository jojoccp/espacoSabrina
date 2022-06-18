package com.espacosabrina.sistemadecontrole.controllers

//import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientDTOToModel
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
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
    fun createClient(@RequestBody clientDTO: ClientDTO): ResponseEntity<String> {
        clientService.save(clientDTO)
        return ResponseEntity.status(HttpStatus.OK).body("Usuário criado com sucesso")
    }

    @PutMapping("/{id}")
    fun updateClient(@PathVariable id: Int, @RequestBody clientDTO: ClientDTO): ResponseEntity<String> {
        var clientFound = clientService.findById(id)

        clientFound.apply {
            this.clientName = clientDTO.clientName
            this.clientCellphone = clientDTO.clientCellphone
        }

        clientService.save(clientFound)

        return ResponseEntity.status(HttpStatus.OK).body("Usuário atualizado com sucesso")
    }

    @DeleteMapping("/{id}")
    fun deleteClient(@PathVariable id: Int): ResponseEntity<String> {
        var clientFound = clientService.findById(id)

        clientService.delete(clientFound)

        return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso")
    }
}