package randomWord

import scala.io.Source
import scala.util.Random

object WinningWord {

   def getWords: List[String] = {
     Source.fromResource("listOfWords").getLines.toList
   }

  def getRandomWord(words: List[String]): String ={
    val winningWord: String = words(Random.nextInt(words.length))
    println(s"Random word chosen is: $winningWord")
    winningWord
  }
}
