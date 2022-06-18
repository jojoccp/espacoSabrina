package com.espacosabrina.sistemadecontrole.services

import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientDTOToModel
import com.espacosabrina.sistemadecontrole.extensionFunctions.clientModeltoDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.repositories.ClientRepository
import org.springframework.stereotype.Service

@Service
class ClientService(private val repository: ClientRepository){

    fun findById(id: Int): ClientDTO {
        var clientFound = repository.findById(id).orElseThrow()

        return clientFound.clientModeltoDTO()
    }

    fun findAll(): MutableList<ClientModel> {
        return repository.findAll()
    }

    fun save(clientDTO: ClientDTO): ClientDTO {
        var clientModel = clientDTO.clientDTOToModel()

        repository.save(clientModel)
        return clientDTO
    }

    fun delete(clientDTO: ClientDTO) {
        var clientModel = clientDTO.clientDTOToModel()
         repository.delete(clientModel)
    }
}

