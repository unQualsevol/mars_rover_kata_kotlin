package com.github.unqualsevol.marsroverkata

import org.junit.jupiter.api.Test
import com.github.unqualsevol.marsroverkata.helpers.RoverBuilder
import kotlin.test.assertEquals

class ReceivingUselessCommandTest {

    @Test
    fun should_not_move_rover_with_empty_command() {
        //Given
        val startRover = RoverBuilder.aMarsRoverAtIrrelevanPosition().build()
        //When
        startRover.sendCommands("")
        //Then
        val expectedRover = RoverBuilder.aMarsRoverAtIrrelevanPosition().build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_not_move_rover_with_wrong_command() {
        //Given
        val startRover = RoverBuilder.aMarsRoverAtIrrelevanPosition().build()
        //When
        startRover.sendCommands("*")
        //Then
        val expectedRover = RoverBuilder.aMarsRoverAtIrrelevanPosition().build()
        assertEquals(expectedRover, startRover)
    }

}
