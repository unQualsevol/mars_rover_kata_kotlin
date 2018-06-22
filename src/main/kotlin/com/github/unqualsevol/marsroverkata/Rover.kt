package com.github.unqualsevol.marsroverkata

data class Rover(var coordinate: Coordinate, var direction: Direction) {

    private val MOVEMENT_INCREMENT : Int = 1

    fun sendCommands(commands: String) {
        for (command in commands.split(Regex("(?!^)"))) {
            executeCommand(command)
        }
    }

    private fun executeCommand(command: String) {
        if (command.equals("f")) {
            coordinate = direction.moveForward(coordinate, MOVEMENT_INCREMENT)
        } else if (command.equals("b")) {
            coordinate = direction.moveBackward(coordinate, MOVEMENT_INCREMENT)
        } else if (command.equals("r")) {
            direction = direction.turnRight()
        } else if (command.equals("l")) {
            direction = direction.turnLeft()
        }
    }

}