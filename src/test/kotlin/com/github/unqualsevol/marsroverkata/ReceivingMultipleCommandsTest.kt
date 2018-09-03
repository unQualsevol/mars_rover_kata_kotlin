package com.github.unqualsevol.marsroverkata
import com.github.unqualsevol.marsroverkata.helpers.RoverBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReceivingMultipleCommandsTest {

    @Test
    fun should_make_multiple_movements() {
        //Given
        val startRover = RoverBuilder.aNasaMarsRover().at(2, 2).pointing("N").build()
        //When
        startRover.sendCommands("flfrfrfflbllf")
        //Then
        val expectedRover = RoverBuilder.aNasaMarsRover().at(3, 2).pointing("S").build()
        assertEquals(expectedRover, startRover)
    }

    @Test
    fun should_make_multiple_movements_when_Esa_rover() {
        //Given
        val startRover = RoverBuilder.aEsaMarsRover().at(2, 2).pointing("N").build()
        //When
        startRover.sendCommands(" l b l x#l x l l bfbbl")
        //Then
        val expectedRover = RoverBuilder.aEsaMarsRover().at(3, 2).pointing("S").build()
        assertEquals(expectedRover, startRover)
    }
}