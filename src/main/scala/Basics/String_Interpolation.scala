package Basics

object String_Interpolation extends App {

  println("Step 1: Using String interpolation to print a variable")
  val favoriteWatch: String = "Fastrack"
  println(s"My favorite watch = $favoriteWatch")


  // 2.  Using String Interpolation on object properties

  println("\n Step 2: Using String Interpolation on object properties")
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut = Donut("Glazed Dobut","Very tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name},tasteLevel = ${favoriteDonut2.tasteLevel}")


  // 3. Using String interpolation to evaluate expressions

  println("\n Step 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buyih 10 donuts = ${qtyDonutsToBuy == 10}")

       // output will be true for this 2nd println

  // 4. Using string interpolation for formatting text

  println("\n Step 4: Using String interpolation for formatting text")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")


  // 5. Using f interpolation to format numbers

  println("\n Step 5: Using f interpolation to format numbers")
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")  // It output will Donut price = 2.5

  // But what if we wanted to print the 2 decimal places for the donutPrice variables. This can be achieved by using the f interpolator.

  println("\n Step 5: Using f interpolation to format numbers")
  val donutPrice2: Double = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice2%.2f")   // Now this time output will be 2.50


  // 6. Using Raw interpolation
  // The raw String interpolation will allow you to print any symbols within your string.

  println("\n Step 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")



}
