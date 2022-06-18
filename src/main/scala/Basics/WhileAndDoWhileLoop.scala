package Basics

object WhileAndDoWhileLoop extends App {

  // Just a reminder that from a pure functional perspective the use of loop such as the while loop is generally less favoured.

  // Instead, fold and recursive operations are preferred.

  // 1. Use of While loop in Scala

  var numberOfBergerToBake = 10
  while (numberOfBergerToBake > 0) {
    println(s"Remaining berger to be baked = $numberOfBergerToBake")
    numberOfBergerToBake -= 1
  }

  // Note: Yes - We've used a mutable variable! And we know that mutation is a bad thing in functional programming!

  // 2. Using do while loop in Scala

  // In do while is that any expressions within the do {} will be ran at least once regardless of the condition within the while() clause.

  var numberOfBergerBaked = 0
  do {
    numberOfBergerBaked += 1
    println(s"Number of berger baked = $numberOfBergerBaked")
  }while (numberOfBergerBaked < 5)

  // Note: fold and tail recursion is more preferred in functional programming.



}
