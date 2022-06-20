package com.ScalaKaJalwa.one.Basics

object Ranges extends App {

  // 1. Create a simple numeric range from 1 to 5 inclusive

  val from1to5 = 1 to 5
  println(s"Numbers from 1 to 5 = $from1to5")


  // 2. Create a numeric range from 1 to 5 but excluding the last integer number 5

  val from1Until5 = 1 until 5
  println(s"Numbers from 1 to 4 = $from1Until5")


  // 3. Create a numeric range from  0 to 10 but increment with multiply by 2

  val from0to10by2 = 1 to 10 by 2
  println(s"Numbers from 0 to 10 increment with 2 = $from0to10by2")

  for (x <- 10 to 1)
    println(x)

  // 4. Create an alphabetical range to represent letter a to z

  val alphabetRangeFromAToz = 'a' to 'z'
  println(s"Range of alphabets from a to z = $alphabetRangeFromAToz")

  // Note: We are using single quotes and not double quotes such that we end up with a character range.


  // 5. Character ranges with user specified increment

  val alphabetRangeFromAtoZBy2 = 'a' to 'z' by 2
  println(s"Range of every other alphabet = $alphabetRangeFromAtoZBy2")


  // 6. Convert the Scala Range into Collections

  // If we wanted to store a range in some data structure such as List, Set, Sequence, Array

  val listFrom1to5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1to5.mkString(" ")}")

  val setFrom1to5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1to5.mkString(" ")}")

  val sequenceFrom1to5 = (1 to 5).toSeq
  println(s"Range to Sequence = ${setFrom1to5.mkString(" ")}")

  val arrayFrom1to5 = (1 to 5).toArray
  println(s"Range to Array = ${arrayFrom1to5.mkString(" ")}")

  // Note: We skipped the () when calling the conversion functions and instead used .toList as opposed to .toList().
  //       The general practice is to skip the () if the function has no side effects.

  // The .mkString() function takes in a delimiter which in our case is just an empty space.


  // We showed how to convert our ranges into collections such as List,Set,Sequence and Array. We then used the mkString() function to create a string representation for the elements in collection.
  // However, to access and print each elements in the collection, you could just as easily used the foreach() function.

  arrayFrom1to5.foreach(println(_))

  // The key thing to remember here is that we used the wildcard _ as part of the print() function parameter.
}
