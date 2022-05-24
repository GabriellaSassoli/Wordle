import round.RoundService.{getMatch, readInput, validateInput}
import randomWord.WordToGuessService.{getRandomWord, getWords}


object Game {
  def main(args: Array[String]) = {
    println("Hello there")
//    choosing winning word for the current game
    val winningWord: String = getRandomWord(getWords)

    val result: String = getMatch(0,validateInput,winningWord)

    println(result)
  }

}
