package randomWord

import scala.io.Source
import scala.util.Random

object WordToGuessService {

   def getWords: List[String] = {
     Source.fromResource("listOfWords").getLines.toList.filter(_.size == 5)
   }

  def getRandomWord(words: List[String]): String ={
    val winningWord: String = words(Random.nextInt(words.length))
    println(s"Random word chosen is: $winningWord")
    winningWord
  }
}
