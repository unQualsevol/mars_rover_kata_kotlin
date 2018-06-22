package com.github.unqualsevol.marsroverkata.location

data class Vector(val coordinate: Coordinate, val direction: Direction) {


    fun turnRight() = Vector(coordinate, direction.turnRight())
    fun turnLeft() = Vector(coordinate, direction.turnLeft())
    fun moveForward(delta: Int): Vector = Vector(direction.moveForward(coordinate, delta), direction)
    fun moveBackward(delta: Int): Vector = Vector(direction.moveBackward(coordinate, delta), direction)

}