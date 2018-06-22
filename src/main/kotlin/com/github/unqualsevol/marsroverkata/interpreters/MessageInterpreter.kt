package com.github.unqualsevol.marsroverkata.interpreters

import com.github.unqualsevol.marsroverkata.commands.Command

interface MessageInterpreter {
    fun createCommands(commands: String): List<Command>
}