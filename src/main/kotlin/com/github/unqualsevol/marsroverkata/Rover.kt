package com.github.unqualsevol.marsroverkata

import com.github.unqualsevol.marsroverkata.location.Coordinate
import com.github.unqualsevol.marsroverkata.location.Direction
import com.github.unqualsevol.marsroverkata.location.Vector

data class Rover(var vector: Vector) {

    private val MOVEMENT_INCREMENT : Int = 1

    constructor(x: Int, y: Int, direction: String) : this(Vector(Coordinate(x, y), Direction.valueOf(direction)))

    fun sendCommands(commands: String) {
        for (command in commands.split(Regex(""))) {
            executeCommand(command)
        }
    }

    private fun executeCommand(command: String) {
        if (command.equals("f")) {
            vector = vector.moveForward(MOVEMENT_INCREMENT)
        } else if (command.equals("b")) {
            vector = vector.moveBackward(MOVEMENT_INCREMENT)
        } else if (command.equals("r")) {
            vector = vector.turnRight()
        } else if (command.equals("l")) {
            vector = vector.turnLeft()
        }
    }

}