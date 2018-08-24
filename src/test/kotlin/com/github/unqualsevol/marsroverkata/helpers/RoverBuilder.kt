package com.github.unqualsevol.marsroverkata.helpers

import com.github.unqualsevol.marsroverkata.Rover

class RoverBuilder {
    var x:Int = 0
        private set
    var y:Int = 0
        private set
    var direction:String? = null
        private set

    fun at(x:Int, y:Int):RoverBuilder {
        this.x = x
        this.y = y
        return this
    }
    fun pointing(direction:String):RoverBuilder {
        this.direction = direction
        return this
    }

    fun build():Rover{
        return Rover(x,y, direction.orEmpty())
    }

companion object {
//static methods here!
    fun aMarsRover():RoverBuilder = RoverBuilder()
    fun aMarsRoverAtIrrelevantPosition():RoverBuilder = aMarsRover().at(0,0)
    fun aMarsRoverAnywherePointingToAnyDirection():RoverBuilder = aMarsRoverAtIrrelevantPosition().pointing("N")
}
}