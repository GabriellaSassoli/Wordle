package round

import org.scalatest.{FlatSpec, Matchers}
import round.RoundService.validateInput
class RoundServiceTest extends FlatSpec with Matchers  {

  "read Input" should "return input value" in {

    val input = "hello"
    val attemptNumber = 1

    validateInput(attemptNumber,input) shouldBe Some("hello")

  }
  "read Input" should "return None if attempt number > 5" in {

    val input = "hello"
    val attemptNumber = 6

    validateInput(attemptNumber,input) shouldBe None

  }
//  it should "throw an error if the word inserted is longer than 5 characters long" in {
//    val input = "hello"
//    val attemptNumber = 1
//
//  }
//  it should "throw an error if the word inserted is shorter than 5 characters long"



}
