package Basics

object TypeInferance extends App {

  // 1. Type inferance

  val watchesToBuy: Int  = 5

  val watchesToBuy2 = 5    // we can assign value to variable directly without data type. Scala will sense it's data type.


  // 2. Using Scala compiler to convert from one data type to another

       // The scala compiler is also smart enough to convert from one data type into another.
       // However,  you should bear in mind that this conversion is fine so long as your resulting type is not lossy.

  val numberOfWatch: Short = 1
  val minimumWatchToBuy: Int = numberOfWatch

  // Note: Converting from Short to an Int was fine because there was no precision loss, i.e an Int is larger than a Short.


  // 3. User driven conversion from one data type to another

  //---You cannot convert from int to a string

  // you can do this using

  val minimumWatchToSell: String = numberOfWatch.toString()

}
