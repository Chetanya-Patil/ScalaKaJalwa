package com.ScalaKaJalwa.one.Basics

import scala.Console.println

object Variables extends App {
 println("Hello World let understand about variables in scala")

 // 1. Immutable Variables
 // val <Name of the variable>: <Scala type> = <Some literals>

 val watchesToBuy: Int = 5
 println("Value of watchesToBuy is : " + watchesToBuy)

 // If we try changing the value of watchesToBuy to 10 it will reassignment to val.
 // And scala is statically typed language soo here in this IDE only will address that error. you will be able see by hover on it.

 //watchesToBuy = 10

 // 2. Mutable variables

    // Scala is a functional programming language which favours the immutable pattern. But what if you are in loop and need to increment some variable.
    // That's the perfect use case and to declare a variables as mutable.
    // We use the keyword var as opposed to val

 var favoriteWatch: String = "Fastrack"

 favoriteWatch = "Sonata"

    // Here, compiler will no longer complains that we are reassigning the value.

 println("My favorite watch is :" + favoriteWatch)

// 3. Lazy initialization

    // Sometime we may wish to delay the initialization of some variable until at the point where it is consumed by your application.
    // This is usually referred to as lazy initialization and we need to make use of the lazy keyword.

   lazy val watchService = "Initialize some watch service"


 // 4. Scala Supported Types

    // Scala does not have built-in types. Instead it was designed from the ground up to have a set of classes for representing its supporting types.

   val watchesBought: Int = 5
   val bigNumberOfWatches: Long = 100000000L
   val smallNumberOfWatches: Short = 1
   val priceOfWatch: Double = 2.50
   val watchPrice: Float = 2.50f
   val watchStoreName: String = "AllWatches Store"
   val watchByte: Byte = 0xa
   val wacthFirstLetter: Char = 'W'
   val nothing: Unit = ()

   // Note: Scala provides a type called Unit. Unit type similar to Java void keyword.

 // 5. Declare a variable with no Initialization

    // Sometimes you may not know the value of your variable immediately. You can only assign your variables value at some later point in time during the execution of your application.

    var FavoriteCar: String = _   // This is the use Wildcard operator


    // latter in your code you can assign to this vairable

    FavoriteCar = "Audi"
}
