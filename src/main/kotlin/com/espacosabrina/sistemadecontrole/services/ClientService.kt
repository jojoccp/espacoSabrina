package com.espacosabrina.sistemadecontrole.services

import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientDTOToModel
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientModeltoDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.repositories.ClientRepository
import org.slf4j.Logger
import org.springframework.stereotype.Service

@Service
class ClientService(private val repository: ClientRepository, val logger: Logger){

    fun findByClientId(id: String): ClientModel {
        return repository.findByClientId(id).orElseThrow()
    }

    fun findAll(): MutableList<ClientModel> {
        return repository.findAll()
    }

    fun save(clientDTO: ClientDTO): ClientDTO {
        var clientModel = clientDTO.clientDTOToModel()

        repository.save(clientModel)
        logger.info("Client - client with id: ${clientModel.clientId} was created")
        return clientDTO
    }

    fun delete(clientDTO: ClientDTO) {
        var clientModel = clientDTO.clientDTOToModel()
         repository.delete(clientModel)
        logger.info("Client - client with id: ${clientDTO.clientId} was deleted")
    }
}

