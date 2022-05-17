package wordComparison

object WordComparison {

//  val winningLetters

//  def compareLettersBetweenWords(word: String,winningWord: String): Seq[Char] = {
//    val letters = word.toList
//    for {
//      i <- 0 to letters.length -1
//      if winningWord.contains(letters(i))
//    } yield letters(i)
//  }

  def getMatch(inputAttempt: Int,
               input: Int => Option[String],
               winningWord: String): String = {
    input(inputAttempt) match {
      case Some(word) if word == winningWord => winningWord
      case Some(_) => {
//        println(compareLettersBetweenWords(word,winningWord))
        getMatch(inputAttempt + 1,input,winningWord)
      }
      case None => "Sorry, you didn't find a match in the available attempts"
    }
  }


}
