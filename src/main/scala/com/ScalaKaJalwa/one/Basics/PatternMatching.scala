package com.ScalaKaJalwa.one.Basics

object PatternMatching extends App {

  // Pattern Matching is functional feature of Scala

  // Pattern matching may at first sight appear similar to switch statements. But Scala's pattern matching is a lot more powerful!

  // 1. Pattern Matching 101 - Very basic example

  // Suppose you want to test a variable called BergerType. In the case that its value is Simple berger, you will print Tasty. On the
  // other hand, if its value is Grill berger, then you will print Very Tasty.

  val BergerType = "Grill berger"
  BergerType match {
    case "Grill berger" => println("very Tasty")
    case "Simple berger" => println("Tasty")
  }



  // 2. Pattern Matching and return the result

  val tasteLevel = BergerType match {
    case "Grill berger" => "Very Tasty"
    case "Simple berger" => "Tasty"
  }

  println(s"TasteLevel of $BergerType = $tasteLevel")


  // 3. Pattern Matching using the wildcard operator

  val tastLevel2 = BergerType match {
    case "Grill berger" => "Very Tasty"
    case "Simple berger" => "Tasty"
    case _ => "Average Taste"                  // If BergerType in above case does not match then it will consider with default case which is specified with wildcard operator
  }

  println(s"Taste level of $BergerType = $tastLevel2")


  // 4. Patter matching with two or more items on the same condition

     // We are lebelling Grill berger item as Very Tasty. What if a Sandwich was also Very Tasty. This behavior seems similar to an OR expression and you can use the pipe | .


  val tasteLevel3 = BergerType match {
    case "Grill berger" | "Sandwich" => "Very Tasty"
    case "Simple berger" => "Tasty"
    case _ => "Average Tasty"
  }
  println(s"TastLevel of $BergerType = $tasteLevel3")


  // 5. Pattern matching and using if expressions in the case clause

         // You can simulate an OR clause by adding if Expression in the case statements.

  val tasteLevel5 = BergerType match {
    case berger if (berger.contains("Grill ") || berger.contains("Sandwich")) => "Very Tasty"
    case "Plain berger" => "Tasty"
    case _ => "Average Tasty"
  }
  println(s"Tast level of $BergerType = $tasteLevel5")

  //  This berger might be a column name. WE NEED TO CHECK THIS ON DATASET


  // 6. Pattern matching by types

     // Up to now we have seen pattern matching on the value of some variable. What if you would like to pattern match on the type of the variable ?

    val priceOfBerger: Any = 2.50
    val priceType = priceOfBerger match {
      case price: Int => "Int"
      case price: Double => "Double"
      case price: Float => "Float"
      case price: String => "String"
      case price: Boolean => "Boolean"
      case price: Char => "Char"
      case price: Long => "long"
    }
    println(s"Berger price type = $priceType")

   // Note: If you come from JAVA, you can think of the Any type similar to the Object class.

  // In other words, Any is at the root of Scala's type hierarchy.








}
