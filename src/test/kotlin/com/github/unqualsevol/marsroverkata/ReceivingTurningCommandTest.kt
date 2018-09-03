package com.github.unqualsevol.marsroverkata
import com.github.unqualsevol.marsroverkata.helpers.RoverBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReceivingTurningCommandTest {
    @Test
    fun should_point_east_when_facing_north_and_turns_right() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("N").build()
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("E").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_south_when_facing_east_and_turns_right() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("E").build()
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("S").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_west_when_facing_south_and_turns_right() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("S").build()
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("W").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_north_when_facing_west_and_turns_right() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("W").build()
        //When
        startRover.sendCommands("r")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("N").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_west_when_facing_north_and_turns_left() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("N").build()
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("W").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_north_when_facing_east_and_turns_left() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("E").build()
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("N").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_east_when_facing_south_and_turns_left() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("S").build()
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("E").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_point_south_when_facing_west_and_turns_left() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("W").build()
        //When
        startRover.sendCommands("l")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRoverAtIrrelevantPosition().pointing("S").build()
        assertEquals(expectedRover, startRover)
    }
}