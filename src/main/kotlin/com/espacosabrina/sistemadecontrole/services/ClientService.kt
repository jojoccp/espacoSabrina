package com.espacosabrina.sistemadecontrole.services

import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.repositories.ClientRepository
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@Service
class ClientService {

    @Autowired
    lateinit var repository: ClientRepository

    fun findById(id: Int): ClientDTO {
        var response = repository.findById(id).orElseThrow()

        lateinit var clientDTO : ClientDTO
        BeanUtils.copyProperties(clientDTO, response)
        return clientDTO
    }

    fun save(clientDTO: ClientDTO): ClientDTO {
        lateinit var clientModel: ClientModel

        BeanUtils.copyProperties(clientModel, clientDTO)
        repository.save(clientModel)
        return clientDTO
    }

    fun findAll(): MutableList<ClientModel> {
        return repository.findAll()
    }

    fun delete(clientModel: ClientModel) {
         repository.delete(clientModel)
    }
}