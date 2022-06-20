package Basics

object TheScalaClassAndTypeHierarchy extends App {

  // type Any is at the top most of the Scala's class hierarchy.

  // Any is the root type and it has sub-classes namely AnyVal and AnyRef.

  // There are no built-in primitive types such as the ones we have in java.

  // 1. Declare a variable of type Any

  val favoriteBerger: Any = "Grill Berger"
  println(s"FavoriteBerger of type Any = $favoriteBerger")


  // 2. Declare a variable of type AnyRef

  val BergerName: AnyRef = "Plain Berger"
  println(s"Berger Name of type AnyRef = $BergerName")


  // 3. Declare a variable of type AnyVal

  val BergerPrice: AnyVal = 2.50
  println(s"BergerPrice if type of AnyVal = $BergerPrice")


















}
