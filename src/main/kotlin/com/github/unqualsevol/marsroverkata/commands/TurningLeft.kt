package com.github.unqualsevol.marsroverkata.commands

import com.github.unqualsevol.marsroverkata.location.Vector

class TurningLeft() : Command {
    override fun execute(vector: Vector): Vector = vector.turnLeft()
}