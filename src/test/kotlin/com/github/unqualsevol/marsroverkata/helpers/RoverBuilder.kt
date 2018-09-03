package com.github.unqualsevol.marsroverkata.helpers

import com.github.unqualsevol.marsroverkata.Rover
import com.github.unqualsevol.marsroverkata.interpreters.EsaMessageInterpreter
import com.github.unqualsevol.marsroverkata.interpreters.MessageInterpreter
import com.github.unqualsevol.marsroverkata.interpreters.NASAMessageInterpreter

class RoverBuilder {
    var x:Int = 0
        private set
    var y:Int = 0
        private set
    var direction:String? = null
        private set
    lateinit var interpreter:MessageInterpreter
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

    fun understandingNasaCommands():RoverBuilder {
        this.interpreter = NASAMessageInterpreter()
        return this
    }

    fun understandingEsaCommands():RoverBuilder {
        this.interpreter = EsaMessageInterpreter()
        return this
    }

    fun build():Rover{
        return Rover(x,y, direction.orEmpty(), interpreter)
    }

companion object {
//static methods here!
    fun aMarsRover():RoverBuilder = RoverBuilder()
    fun aMarsRoverAtIrrelevantPosition():RoverBuilder = aMarsRover().at(0,0)
    fun aMarsRoverAnywherePointingToAnyDirection():RoverBuilder = aMarsRoverAtIrrelevantPosition().pointing("N")

    fun aNasaMarsRover():RoverBuilder = aMarsRover().understandingNasaCommands()
    fun aNasaMarsRoverAtIrrelevantPosition():RoverBuilder = aNasaMarsRover().at(0,0)
    fun aNasaMarsRoverAnywherePointingToAnyDirection():RoverBuilder = aNasaMarsRoverAtIrrelevantPosition().pointing("N")

    fun aEsaMarsRover():RoverBuilder = aMarsRover().understandingEsaCommands()
    fun aEsaMarsRoverAtIrrelevantPosition():RoverBuilder = aEsaMarsRover().at(0,0)
    fun aEsaMarsRoverAnywherePointingToAnyDirection():RoverBuilder = aEsaMarsRoverAtIrrelevantPosition().pointing("N")

}
}