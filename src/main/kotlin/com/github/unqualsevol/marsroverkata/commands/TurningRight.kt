package com.github.unqualsevol.marsroverkata.commands

import com.github.unqualsevol.marsroverkata.location.Vector

class TurningRight() : Command {
    override fun execute(vector: Vector): Vector = vector.turnRight()
}