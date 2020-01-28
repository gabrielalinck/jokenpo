package com.jokenpo

import org.springframework.stereotype.Service

@Service
class JokenpoService {
    fun play(player1: String, player2: String): String {
        val move = listOf(player1, player2)
        if (validation(player1, player2)) return "invalid move"

        return rules(move)
    }

    private fun rules(move: List<String>): String {
        var response = "Draw"
        if(move.contains("rock") && move.contains("scissors")) response = "Rock wins"
        if(move.contains("scissors") && move.contains("paper")) response = "Scissors wins"
        if(move.contains("paper") && move.contains("rock")) response = "Paper wins"

        return response
    }

    private fun validation(player1: String, player2: String): Boolean {
        val validOptions = listOf("rock", "paper", "scissors")
        if (!validOptions.contains(player1) || !validOptions.contains(player2)) return true

        return false
    }
}