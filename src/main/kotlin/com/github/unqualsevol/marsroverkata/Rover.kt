package com.github.unqualsevol.marsroverkata

import com.github.unqualsevol.marsroverkata.commands.Command
import com.github.unqualsevol.marsroverkata.interpreters.MessageInterpreter
import com.github.unqualsevol.marsroverkata.interpreters.NASAMessageInterpreter
import com.github.unqualsevol.marsroverkata.location.Vector

data class Rover(var vector: Vector) {

    private lateinit var interpreter: MessageInterpreter

    constructor(x: Int, y: Int, direction: String) : this(Vector(x, y, direction))
    {
        this.interpreter = NASAMessageInterpreter()
    }

    fun sendCommands(message: String) {
        execute(interpreter.createCommands(message))
    }

    fun execute(commands: List<Command>) {
        for (command: Command in commands) {
            vector = command.execute(vector)
        }
    }

}