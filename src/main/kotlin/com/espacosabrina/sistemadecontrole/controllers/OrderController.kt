package com.espacosabrina.sistemadecontrole.controllers

import com.espacosabrina.sistemadecontrole.dtos.OrderDTO
import com.espacosabrina.sistemadecontrole.models.OrderModel
import com.espacosabrina.sistemadecontrole.services.ClientService
import com.espacosabrina.sistemadecontrole.services.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/orders")
class OrderController {

    @Autowired
    lateinit var orderService: OrderService

    @GetMapping
    fun getAllOrders(): ResponseEntity<MutableList<OrderModel>> {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.findAll())
    }

//    @PostMapping
//    fun createOrder(@RequestBody orderDTO: OrderDTO): {
//        orderService.save(orderDTO)
//        return ResponseEntity.status(HttpStatus.OK).body("Usuário criado com sucesso")
//    }
}