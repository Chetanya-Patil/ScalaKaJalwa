package com.ScalaKaJalwa.one.Basics

object UseOption_AvoidNulls {

  // How to use Option, Some and None.

  // If you have used other programming languages in the past such as Java or .NET, I'm pretty sure that you must have seen your share of NullPointerException!

  // By making use of Option, Some and None, Scala encourages you to write functions with no side effects.
  // As a result, all your headaches with NullPointerException should go away :)

  // 1.  Use Option and Some - a basic example

  val grillBergerTaste: Option[String] = Some("Very Tasty")

  println(s"Grill berger taste = ${grillBergerTaste.get}")         // Very Tasty

  // Note:- Because we have wrapped our String into an Option, to retrieve its value we call the get() function as shown above.

  // But calling get() in a production system is generally a code smell as you may end up with the same NullPointerException.


  // 2. Use Option and None - a basic example

  val grillBergerName: Option[String] = None

  println(s"Gril berger name = ${grillBergerName.getOrElse("Grill Berger")}")    // Grill berger name = Grill Berger

  // Note: - We've used the handy getOrElse() function from the Option to supply a default value.

  // If you were to call the get() function. you will get the exception-->  Java.util.NoSuchElementException: None.get

  // At this point, you may be asking yourself that this exception is similar to your NullPointerException.

  // You are absolultely right! But Pattern matching is your friend :)


  // 3. Use Pattern Matching with Option

  // We has already seen that you can use the getOrElse() function to get a default value in case your variable had no data.
  // But you can also use Pattern Matching

  grillBergerName match {
    case Some(name) => println(s"Received berger name = $name")
    case None => println(s"No berger name was found!")
  }

  /*  Note: -
  *   1. Sure, you can argue that we have not achieved much!
  *   2. But, let's take a pause and assume that you were calling some function to populate your variable grillBergerName.
  *   3. As a consumer of that function call, you would not know that the function could potentially return null.
  *
  *
  *   4. By being explicit that such a function will return an Option, any consumer of the function can avoid NullPointerException by using getOrElse() or Pattern Matching.
  *
  *
  *
  *    You can use the map() function as a more elegant way of filtering out None.
  * */

    println("\n Filter None using map function")
    grillBergerTaste.map(taste => println(s"grillBergerTaste = $taste"))   // Very Tasty
    grillBergerName.map(name => println(s"grillbergerName = $name"))     // Was no printed as its value was None.




  def main(args: Array[String]): Unit = {


  }

}
