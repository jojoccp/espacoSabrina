package com.espacosabrina.sistemadecontrole.controllers

import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientDTOToModel
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientModeltoDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.services.ClientService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*



@Controller
@RequestMapping("/clients")
class ClientController(val logger: Logger) {

    @Autowired
    lateinit var clientService: ClientService

    @CrossOrigin
    @GetMapping
    fun getAllClients(): ResponseEntity<MutableList<ClientModel>> {
        logger.info("Client - getting all clients")
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findAll())
    }

    @CrossOrigin
    @GetMapping("/byClientId/{clientId}")
    fun getClientById(@PathVariable clientId: String): ResponseEntity<ClientModel> {
        logger.info("Client - getting client with id: $clientId")
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findByClientId(clientId))
    }

    @CrossOrigin
    @PostMapping
    fun createClient(@RequestBody clientDTO: ClientDTO): ResponseEntity<String> {
        logger.info("Client - creating a client")
        clientService.save(clientDTO)
        return ResponseEntity.status(HttpStatus.OK).body("Usuário criado com sucesso")
    }

    @CrossOrigin
    @PutMapping("/{clientId}")
    fun updateClient(@PathVariable clientId: String, @RequestBody clientDTO: ClientDTO): ResponseEntity<String> {
        logger.info("Client - updating client with id: $clientId")
        var clientFound = clientService.findByClientId(clientId)

        clientFound.apply {
            this.clientName = clientDTO.clientName
            this.clientCellphone = clientDTO.clientCellphone
        }

        clientService.save(clientFound.clientModeltoDTO())

        return ResponseEntity.status(HttpStatus.OK).body("Usuário atualizado com sucesso")
    }

    @CrossOrigin
    @DeleteMapping("/{clientId}")
    fun deleteClient(@PathVariable clientId: String): ResponseEntity<String> {
        logger.info("Client - deleting client with id: $clientId")
        var clientFound = clientService.findByClientId(clientId)

        clientService.delete(clientFound.clientModeltoDTO())

        return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso")
    }
}