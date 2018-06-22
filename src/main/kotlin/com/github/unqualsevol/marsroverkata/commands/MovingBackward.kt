package com.github.unqualsevol.marsroverkata.commands

import com.github.unqualsevol.marsroverkata.location.Vector

class MovingBackward(val delta: Int) : Command {
    override fun execute(vector: Vector): Vector = vector.moveBackward(delta)
}