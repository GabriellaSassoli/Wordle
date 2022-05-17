import userInteraction.Input.readInput
import randomWord.WinningWord.{getRandomWord, getWords}
import wordComparison.WordComparison.getMatch

object Wordle {
  def main(args: Array[String]) = {
    println("Hello there")
//    choosing winning word for the current game
    val winningWord: String = getRandomWord(getWords)

    val result: String = getMatch(0,readInput,winningWord)

    println(result)
  }

}
