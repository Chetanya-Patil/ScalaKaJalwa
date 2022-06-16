package Basics

object ForLoop extends App {

  // 1. A simple for loop from 1 to 5 inclusive

      // Simple for loop by iterating from 1 to 5 and print the immutable variable numberOfBerger during each iteration.

  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for(numberOfBerger <- 1 to 5){
    println(s"Number of berger to buy = $numberOfBerger")
  }

  // Here, we used keyword "to" which meant that iteration number 5 was included.


  // 2. A simple for loop from 1 to 5, where 5 is NOT inclusive

     // Scala's language fluency with the use of keyword "until" makes it clear that your for loop will NOT include the last iteration.

  for(numberOfBerger <- 1 until 5)
    {
      println(s"Number of berger to buy = $numberOfBerger")
    }

   // Note: We used of keyword until which meant that the iteration number 5 was NOT included.


  // 3. Filter values using if conditions in for loop
}
