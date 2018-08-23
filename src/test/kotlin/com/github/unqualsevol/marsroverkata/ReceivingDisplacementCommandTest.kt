package com.github.unqualsevol.marsroverkata
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReceivingDisplacementCommandTest {

    @Test
    fun should_increase_Y_when_facing_north_and_moves_forward() {
        //Given
        val startRover = Rover(2, 2, "N")
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(2, 3, "N")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_X_when_facing_east_and_moves_forward() {
        //Given
        val startRover = Rover(2, 2, "E")
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(3, 2, "E")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_Y_when_facing_south_and_moves_forward() {
        //Given
        val startRover = Rover(2, 2, "S")
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(2, 1, "S")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_X_when_facing_west_and_moves_forward() {
        //Given
        val startRover = Rover(2, 2, "W")
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(1, 2, "W")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_Y_when_facing_north_and_moves_backward() {
        //Given
        val startRover = Rover(2, 2, "N")
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(2, 1, "N")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_X_when_facing_east_and_moves_backward() {
        //Given
        val startRover = Rover(2, 2, "E")
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(1, 2, "E")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_Y_when_facing_south_and_moves_backward() {
        //Given
        val startRover = Rover(2, 2, "S")
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(2, 3, "S")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_X_when_facing_west_and_moves_backward() {
        //Given
        val startRover = Rover(2, 2, "W")
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(3, 2, "W")
        assertEquals(expectedRover, startRover)
    }
}