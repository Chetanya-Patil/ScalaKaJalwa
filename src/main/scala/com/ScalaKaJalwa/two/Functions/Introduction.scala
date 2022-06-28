package com.ScalaKaJalwa.two.Functions

object Introduction {
  def main(args: Array[String]): Unit = {

    // Creating and Using functions in Scala

    // 1. Define and use a function which has no parameters and has a return type

    def favoriteBerger(): String = {
      "Grill Berger"
    }

    val myFavoriteBerger = favoriteBerger()
    println(s"My Favorite berger is $myFavoriteBerger")

    // The last line within the body of the function is the one that will be returned bak to the caller.


    // 2. Define and use a function  with no parenthesis
    def leastFavouriteBerger = "Plain Berger"
    println(s"My least favourite berger is $leastFavouriteBerger")


    // 3. Define and use a function with no return type
    def FunctionWithNoReturnType(): Unit = {
      println(s"Printing sales report ... done!")
    }

    FunctionWithNoReturnType()


  }

}
