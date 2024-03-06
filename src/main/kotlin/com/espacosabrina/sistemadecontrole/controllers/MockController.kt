package com.espacosabrina.sistemadecontrole.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger

@Controller
@RequestMapping("/mockzinho")
class MockController(val logger:Logger) {

    @CrossOrigin
    @GetMapping("/porra")
    fun getClientById(){
        logger.info("Client - getting all clients")
    }
}
