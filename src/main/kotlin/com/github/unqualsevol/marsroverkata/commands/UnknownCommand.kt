package com.github.unqualsevol.marsroverkata.commands

import com.github.unqualsevol.marsroverkata.location.Vector

class UnknownCommand() : Command {
    override fun execute(vector: Vector): Vector = vector
}