package com.ScalaKaJalwa.two.Functions

object FunctionWithParameters {

  // Define functon with parameters
  def calculateBergerCost(bergerName: String, quantity: Int): Double = {
    println(s"Calculating cost for $bergerName, quantity = $quantity")
    2.50 * quantity
  }

  // It is good practice to be explicit about the return types of your function. Here we explicitly added the return type of Double to the function.

  // Call a function with parameters
  val totalCost = calculateBergerCost("Grill Berger", 5)
  println(s"Total cost of berger = $totalCost")


  // Add default values to function parameters

        // What if some customers who present you a coupon code are eligible for additional discount when buyinh berger from your store ?
        // Let's add another paramter named couponCode of type String. But, since not all customers will have a coupon code, let's default the value of couponCode to say "NO CODE".

  def calculateBergerCost2(bergerName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calculating cost for $bergerName, quantity = $quantity, couponCode = $couponCode")
    // make some calculations ....
    2.50 * quantity
  }

  // Note: Limit your use of defaulting parameters for simple cases only.
  //     - There are better ways to achieve the desired effect of some customers presenting a coupon code such as using Option.



  def main(args: Array[String]): Unit = {


  }
}

