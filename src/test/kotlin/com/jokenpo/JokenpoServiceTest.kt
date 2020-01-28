package com.jokenpo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class JokenpoServiceTest {

    @Autowired
    private var service: JokenpoService = JokenpoService()

    @Test
    fun `if player1 is invalid and player2 is valid returns invalid move`() {
        val actual = service.play("invalid", "scissors")
        val expected = "invalid move"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player1 is valid and player2 is invalid returns invalid move`() {
        val actual = service.play("rock", "invalid")
        val expected = "invalid move"

        assertEquals(expected, actual)
    }

    @Test
    fun `if players are invalid returns invalid move`() {
        val actual = service.play("invalid", "invalid")
        val expected = "invalid move"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player1 is rock and player2 is scissors player1 wins`() {
        val actual = service.play("rock", "scissors")
        val expected = "Rock wins"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player1 is scissors and player2 is paper player1 wins`() {
        val actual = service.play("scissors", "paper")
        val expected = "Scissors wins"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player1 is paper and player2 is rock player1 wins`() {
        val actual = service.play("paper", "rock")
        val expected = "Paper wins"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player1 is rock and player2 is rock player1 it's a draw`() {
        val actual = service.play("rock", "rock")
        val expected = "Draw"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player1 is scissors and player2 is scissors player1 it's a draw`() {
        val actual = service.play("scissors", "scissors")
        val expected = "Draw"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player1 is paper and player2 is paper player1 it's a draw`() {
        val actual = service.play("paper", "paper")
        val expected = "Draw"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player2 is rock and player1 is scissors player2 wins`() {
        val actual = service.play("scissors", "rock")
        val expected = "Rock wins"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player2 is scissors and player1 is paper player2 wins`() {
        val actual = service.play("paper", "scissors")
        val expected = "Scissors wins"

        assertEquals(expected, actual)
    }

    @Test
    fun `if player2 is paper and player1 is rock player2 wins`() {
        val actual = service.play("rock", "paper")
        val expected = "Paper wins"

        assertEquals(expected, actual)
    }
}