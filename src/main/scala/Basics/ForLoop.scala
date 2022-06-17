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

     // In Scala you can also use if clause to add filtering support as you iterate through you items.

     // As an example, let's store a List of ingredients for baking berger into an immutable variable called bergerIngredients.
     // We then loop through each ingredient in the list and filter out all items except for the "sugar" items.

  val bergerIngredients = List("flour","sugar","egg yolks","syrup","flavouring")
  for(ingredient <- bergerIngredients if ingredient == "sugar"){
    println(s"Found sweetening ingredient = $ingredient")
  }

  for(ingredient <- bergerIngredients if ingredient != "sugar"){
    println(s"Found sweetening ingredient = $ingredient")
  }


  // Note: We are showing how to declare and use a List. If you are coming from JAVA, you may be surprised not to find the new keyword used when declaring the List object.
  //       This is made possible in Scala using companion objects.

  // There are better ways at filtering out items from collections which we will see.


  // 4. Filter values using if conditions in for loop and return the result back using the yield keyword

     // Insead of using the (), we are using the {} in our for comprehension to make our expression more explicit.

     // In addition, to return the result of the for comprehension and store it in the variable, we will make use of the yield keyword.

  val TestyIngredients = for { ingredient <- bergerIngredients if (ingredient == "sugar" || ingredient == "syrup" )} yield ingredient

  println(s"Testy Ingredients = $TestyIngredients")

   for { x <- 0 until 3
         y <- 0 until 3 if x < y }
     println(s"$x,$y")



  // Just play with now

  // 1. Try to use scala for making each and every type star struture.
  // 2. Try to get some realtime usecase of for loop it has lot many use in spark.







}
