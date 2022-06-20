package Basics

object Options {

  val aList:List[Int] = List(1,2,3)
  val aTransformedList = aList.map(x => x + 1)  //[2,3,4]
  val aTransformedList_v2 = aList.flatMap(x => List(x,x+1)) //[1,2,2,3,3,4]
  val aFilteredList = aList.filter(x => x % 2 == 0) // [2]

  for (x <- List(1,2,3)) println(x)

  val output = for {x <- List(1,2,3)
                    y <- List('a','b','c')
                    } yield s"$x-$y"
  println(output)
  //List(1,2,3).flatMap(num => List('a','b','c').map(char => println(s"$num-$char")))   //Same output like above

  // Option = Option is a list in between quotes "list" with at most one element.
           // either contain single value or no value

  val anOption: Option[Int] = Option(42)  //Some(42)
  val anOption_v2 :Option[Int] = Some(42) //the same
  val anEmptyOption: Option[Int] = Option.empty //None
  val anEmptyOption_v2: Option[Int] = None

  val aTransformedOption: Option[Int] = anOption.map(x => x * 10)  //Some(420)
  val aTransformedOption_v2:Option[Int] = anOption.flatMap(x => Option(x * 10)) // Some(420)
  val aFilteredOption: Option[Int] = anOption.filter(x => x > 100) //None
  val combinedOptions = for {
    num <- Option(42)
    str <- Option("Scala")
  } yield s"$str is the meaning of life, ake $num"

  //Option API
  val checkEmpty: Boolean = anOption.isEmpty
  val innerValue: Int = anOption.getOrElse(99)
  val aChainedOption: Option[Int] = anEmptyOption.orElse(anOption)


  // Option describes the possible absence of a value
  def unsafeMethod(arg: Int):String = null
  //defensive code
  val potentialValue = unsafeMethod(44)
  val myRealResult =
    if (potentialValue == null)
      "Error"
    else
      potentialValue.toUpperCase()


  val callToExternalService = unsafeMethod(55)
  val combinedResult =
    if (potentialValue == null)
      if (callToExternalService == null)
        "Error 1"
      else
        "Error 2"
    else
      if (callToExternalService == null)
        "Error 3"
      else
        potentialValue.toUpperCase() + callToExternalService.toUpperCase()


  val betterCombinedResult :Option[String] = for {
    firstValue <- Option(unsafeMethod(44))
    secondValue <- Option(unsafeMethod(55))
  } yield firstValue.toUpperCase() + secondValue.toUpperCase()
  val finalValue = betterCombinedResult.getOrElse("ERROR")

  //Best Practice 1: Wrap unsafe APIs inside options














  def main(args: Array[String]):Unit = {


  }
}
