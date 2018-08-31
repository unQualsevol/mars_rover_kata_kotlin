package com.github.unqualsevol.marsroverkata
import com.github.unqualsevol.marsroverkata.helpers.RoverBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReceivingDisplacementCommandTest {

    @Test
    fun should_increase_Y_when_facing_north_and_moves_forward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("N").build()
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(2, 3).pointing("N").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_X_when_facing_east_and_moves_forward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("E").build()
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(3, 2).pointing("E").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_Y_when_facing_south_and_moves_forward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("S").build()
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(2, 1).pointing("S").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_X_when_facing_west_and_moves_forward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("W").build()
        //When
        startRover.sendCommands("f")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(1, 2).pointing("W").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_Y_when_facing_north_and_moves_backward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("N").build()
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(2, 1).pointing("N").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_decrease_X_when_facing_east_and_moves_backward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("E").build()
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(1, 2).pointing("E").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_Y_when_facing_south_and_moves_backward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("S").build()
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(2, 3).pointing("S").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_increase_X_when_facing_west_and_moves_backward() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("W").build()
        //When
        startRover.sendCommands("b")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(3, 2).pointing("W").build()
        assertEquals(expectedRover, startRover)
    }
}