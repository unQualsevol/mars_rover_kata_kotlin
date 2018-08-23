package com.github.unqualsevol.marsroverkata
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReceivingTurningCommandTest {
    @Test
    fun should_point_east_when_facing_north_and_turns_right() {
        //Given
        val startRover = Rover(2, 2, "N")
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(2, 2, "E")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_south_when_facing_east_and_turns_right() {
        //Given
        val startRover = Rover(2, 2, "E")
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(2, 2, "S")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_west_when_facing_south_and_turns_right() {
        //Given
        val startRover = Rover(2, 2, "S")
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(2, 2, "W")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_north_when_facing_west_and_turns_right() {
        //Given
        val startRover = Rover(2, 2, "W")
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(2, 2, "N")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_west_when_facing_north_and_turns_left() {
        //Given
        val startRover = Rover(2, 2, "N")
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(2, 2, "W")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_north_when_facing_east_and_turns_left() {
        //Given
        val startRover = Rover(2, 2, "E")
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(2, 2, "N")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_east_when_facing_south_and_turns_left() {
        //Given
        val startRover = Rover(2, 2, "S")
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(2, 2, "E")
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_south_when_facing_west_and_turns_left() {
        //Given
        val startRover = Rover(2, 2, "W")
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(2, 2, "S")
        assertEquals(expectedRover, startRover)
    }
}