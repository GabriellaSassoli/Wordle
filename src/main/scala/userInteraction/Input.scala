package userInteraction

import scala.io.StdIn.readLine

object Input {

  def readInput(attemptNumber : Int): Option[String] = {
    if ( attemptNumber > 5) None // Not sure this should be here
    else {
      println("Insert guess word: ")
      Some(readLine().toLowerCase())
    }
  }

}
