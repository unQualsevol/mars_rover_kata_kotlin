package com.github.unqualsevol.marsroverkata.commands

import com.github.unqualsevol.marsroverkata.location.Vector

interface Command {
    fun execute(vector: Vector): Vector
}