package com.github.unqualsevol.marsroverkata
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReceivingMultipleCommandsTest {

    @Test
    fun should_make_multiple_movements() {
        //Given
        val startRover = Rover(2, 2, "N")
        //When
        startRover.sendCommands("flfrfrfflbllf")
        //Then
        val expectedRover = Rover(3, 2, "S")
        assertEquals(expectedRover, startRover)
    }
}