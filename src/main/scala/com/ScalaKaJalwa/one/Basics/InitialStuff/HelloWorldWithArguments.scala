package com.ScalaKaJalwa.one.Basics.InitialStuff

object HelloWorldWithArguments extends App {

  println("Hello World with Arguments Scala Application!")

  println("Command Line Arguments are: ")
  println(args.mkString(", "))


  // Tip:
  // Access a specific command line argument
  // Since the args variable which we inherited from the App trait is an Array of type String, we can access say the first argument only using the following syntax:
  // args(0)




}
