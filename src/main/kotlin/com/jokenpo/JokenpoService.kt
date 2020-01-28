package com.jokenpo

import org.springframework.stereotype.Service

@Service
class JokenpoService {
    fun play(player1: String, player2: String): String {

        val move = listOf(player1, player2)
        move.contains("rock")

        if(move.contains("rock") && move.contains("scissors")) { return "Rock wins" }
        if(move.contains("scissors") && move.contains("paper")) { return "Scissors wins" }
        if(move.contains("paper") && move.contains("rock")) { return "Paper wins" }

        return "Draw"
    }
}