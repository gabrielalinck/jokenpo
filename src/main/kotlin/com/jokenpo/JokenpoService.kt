package com.jokenpo

import org.springframework.stereotype.Service

@Service
class JokenpoService {
    fun play(player1: String, player2: String): String {
        if(player1 == "rock" && player2 == "scissors") { return "Player 1 wins" }
        if(player1 == "scissors" && player2 == "paper") { return "Player 1 wins" }
        if(player1 == "paper" && player2 == "rock") { return "Player 1 wins" }
        if(player1 == "scissors" && player2 == "rock") { return "Player 2 wins" }
        if(player1 == "paper" && player2 == "scissors") { return "Player 2 wins" }
        if(player1 == "rock" && player2 == "paper") { return "Player 2 wins" }

        return "Draw"
    }
}