package com.github.unqualsevol.marsroverkata.interpreters

import com.github.unqualsevol.marsroverkata.commands.*

class EsaMessageInterpreter() : MessageInterpreter {

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
        if (commandAsString.equals("l")) {
            return MovingForward(MOVEMENT_INCREMENT)
        } else if (commandAsString.equals("f")) {
            return MovingBackward(MOVEMENT_INCREMENT)
        } else if (commandAsString.equals("b")) {
            return TurningLeft()
        } else if (commandAsString.equals("x")) {
            return TurningRight()
        } else {
            return UnknownCommand()
        }
    }

}