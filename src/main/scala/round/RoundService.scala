package round

import scala.io.StdIn.readLine

object RoundService {

  def validateInput(attemptNumber : Int, input: String): Option[String] = {
    if ( attemptNumber > 5) None
    else {
      if (input.length == 5) Some(input)
      else {
        println("NOTE: Word of wrong length, make sure you insert a 5 letter word\n")
        validateInput(attemptNumber,readInput)
      }
    }

  }

  private def readInput: String = {
    println("Insert guess word (Note: It must be a 5 letter word): ")
    readLine().toLowerCase()
  }

  def getMatch(inputAttempt: Int,
               validateInput: (Int,String) => Option[String],
               winningWord: String): String = {
    validateInput(inputAttempt,readInput) match {
      case Some(word) if word == winningWord => winningWord
      case Some(_) => {
        getMatch(inputAttempt + 1,validateInput,winningWord)
      }
      case None => "Sorry, you didn't find a match in the available attempts"
    }
  }

}
