package com.espacosabrina.sistemadecontrole.services

import com.espacosabrina.sistemadecontrole.dtos.OrderDTO
import com.espacosabrina.sistemadecontrole.extensionFunctions.orderDTOToModel
import com.espacosabrina.sistemadecontrole.extensionFunctions.orderModelToDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.models.OrderModel
import com.espacosabrina.sistemadecontrole.repositories.ClientRepository
import com.espacosabrina.sistemadecontrole.repositories.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(private val repository: OrderRepository) {

    fun findById(id: Int): OrderDTO {
        var orderFound = repository.findById(id).orElseThrow()

        return orderFound.orderModelToDTO()
    }

    fun findAll(): MutableList<OrderModel> {
        return repository.findAll()
    }

    fun save(orderDTO: OrderDTO): OrderDTO {
        var orderModel = orderDTO.orderDTOToModel()

        repository.save(orderModel)
        return orderDTO
    }

    fun delete(orderDTO: OrderDTO) {
        var orderModel = orderDTO.orderDTOToModel()

        repository.delete(orderModel)
    }
}