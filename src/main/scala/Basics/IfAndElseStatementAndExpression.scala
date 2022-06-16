package Basics

object IfAndElseStatementAndExpression extends App {

  // 1. Using if clause as a statement

  println("Step 1: Using if clause as a statement")
  val numberOfPerson = 10
  val bergerPerPerson = 2

  if(numberOfPerson > 10)
    println(s"Number of berger to buy = ${numberOfPerson * bergerPerPerson}")


  // 2. Using if and else clause as a statement

  val defaultBergerToBuy: Int = 8

  if(numberOfPerson > 10)
    println(s"Number of berger to buy = ${numberOfPerson * bergerPerPerson}")
  else
    println(s"Number of berger to buy = ${defaultBergerToBuy}")


  // 3. Using if, else if, and else clause as a statement

  if(numberOfPerson > 10)
    {
      println(s"Number of berger to buy = ${numberOfPerson * bergerPerPerson}")
    }
  else if (numberOfPerson == 0)
    {
      println("Number of people is zero No need to buy berger")
    }
  else
    println(s"Number of berger to buy = ${defaultBergerToBuy}")


  // 4. Using if and else clause as expression

     // What if you had to store the result of the if and else expressions above into variable.

  val numberOfBergerToBuy = if(numberOfPerson > 10) (numberOfPerson * bergerPerPerson) else defaultBergerToBuy

  println(s"Number of berger to Buy = ${numberOfBergerToBuy}")

}
