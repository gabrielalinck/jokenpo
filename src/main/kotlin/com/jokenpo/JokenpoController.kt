package com.jokenpo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class JokenpoController(private val service: JokenpoService) {

    @GetMapping("/play")
    fun greeting(@RequestParam player1: String, @RequestParam player2: String ) =
            service.play(player1, player2)
}