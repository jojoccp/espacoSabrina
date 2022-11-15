package com.espacosabrina.sistemadecontrole.repositories

import com.espacosabrina.sistemadecontrole.models.ClientModel
import com.espacosabrina.sistemadecontrole.models.OrderModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface OrderRepository: JpaRepository<OrderModel, Int> {

    override fun findById(id: Int): Optional<OrderModel>

    override fun findAll(): MutableList<OrderModel>

     fun save(orderModel: OrderModel): OrderModel

     override fun delete(orderModel: OrderModel)
}