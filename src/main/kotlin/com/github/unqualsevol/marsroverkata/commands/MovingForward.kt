package com.github.unqualsevol.marsroverkata.commands

import com.github.unqualsevol.marsroverkata.location.Vector

class MovingForward(val delta: Int) : Command {
    override fun execute(vector: Vector): Vector = vector.moveForward(delta)
}