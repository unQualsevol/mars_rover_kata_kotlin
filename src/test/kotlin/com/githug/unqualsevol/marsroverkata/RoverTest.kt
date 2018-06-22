package com.githug.unqualsevol.marsroverkata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RoverTest {

    @Test
    fun should_not_move_rover_with_empty_command() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.N)
        //When
        startRover.sendCommands("")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.N)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_Y_when_facing_north_and_moves_forward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.N)
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(Coordinate(2, 3), Direction.N)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_X_when_facing_east_and_moves_forward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.E)
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(Coordinate(3, 2), Direction.E)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_Y_when_facing_south_and_moves_forward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.S)
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(Coordinate(2, 1), Direction.S)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_X_when_facing_west_and_moves_forward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.W)
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = Rover(Coordinate(1, 2), Direction.W)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_Y_when_facing_north_and_moves_backward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.N)
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(Coordinate(2, 1), Direction.N)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_X_when_facing_east_and_moves_backward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.E)
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(Coordinate(1, 2), Direction.E)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_Y_when_facing_south_and_moves_backward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.S)
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(Coordinate(2, 3), Direction.S)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_X_when_facing_west_and_moves_backward() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.W)
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = Rover(Coordinate(3, 2), Direction.W)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_east_when_facing_north_and_turns_right() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.N)
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.E)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_south_when_facing_east_and_turns_right() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.E)
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.S)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_west_when_facing_south_and_turns_right() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.S)
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.W)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_north_when_facing_west_and_turns_right() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.W)
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.N)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_west_when_facing_north_and_turns_left() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.N)
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.W)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_north_when_facing_east_and_turns_left() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.E)
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.N)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_east_when_facing_south_and_turns_left() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.S)
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.E)
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_south_when_facing_west_and_turns_left() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.W)
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = Rover(Coordinate(2, 2), Direction.S)
        assertEquals(expectedRover, startRover)
    }



    @Test
    fun should_make_multiple_movements() {
        //Given
        val startRover = Rover(Coordinate(2, 2), Direction.N)
        //When
        startRover.sendCommands("flfrfrfflbllf")
        //Then
        val expectedRover = Rover(Coordinate(3, 2), Direction.S)
        assertEquals(expectedRover, startRover)
    }
}
