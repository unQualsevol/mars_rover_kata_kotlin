package com.github.unqualsevol.marsroverkata.interpreters

import com.github.unqualsevol.marsroverkata.commands.*

class NASAMessageInterpreter() : MessageInterpreter {

    private val MOVEMENT_INCREMENT: Int = 1

    override fun createCommands(message: String): List<Command> {
        val commands = mutableListOf<Command>()
        parseMessage(message).forEach { commands.add(createCommand(it)) }
        return commands
    }

    fun parseMessage(message: String): List<String> {
        return message.split(Regex(""))
    }

    fun createCommand(commandAsString: String): Command {
        if (commandAsString.equals("f")) {
            return MovingForward(MOVEMENT_INCREMENT)
        } else if (commandAsString.equals("b")) {
            return MovingBackward(MOVEMENT_INCREMENT)
        } else if (commandAsString.equals("l")) {
            return TurningLeft()
        } else if (commandAsString.equals("r")) {
            return TurningRight()
        } else {
            return UnknownCommand()
        }
    }

}