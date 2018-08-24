package com.github.unqualsevol.marsroverkata
import com.github.unqualsevol.marsroverkata.helpers.RoverBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReceivingMultipleCommandsTest {

    @Test
    fun should_make_multiple_movements() {
        //Given
        val startRover = RoverBuilder.aMarsRover().at(2, 2).pointing("N").build()
        //When
        startRover.sendCommands("flfrfrfflbllf")
        //Then
        val expectedRover = RoverBuilder.aMarsRover().at(3, 2).pointing("S").build()
        assertEquals(expectedRover, startRover)
    }
}