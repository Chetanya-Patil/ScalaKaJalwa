package Basics

object Tuple_PatterMatch extends App {

  // How to use Tuples (Patter Match)

  // We will use the convenient Tuple classes to easily store elements as pairs.

  // In Scala,you can think og tuples in terms of providing easy semantics for grouping your data points.

  // 1. Using Tuple2 to store 2 data points

     // What if you would like to store the taste level of berger along with the berger type ? The Tuple2 Class is your friend here :)

  val BergerTuple = Tuple2("Grill berger", "Very Tasty")
  println(s"Berger with 2 data points = $BergerTuple")

  // 2. Access each elements in tuple

  val BergerType = BergerTuple._1
  val BergerTasteLevel = BergerTuple._2
  println(s"$BergerType taste level is $BergerTasteLevel")


  // 3. Using TupleN Classes to store more than 2 data points

        // What if you also wanted to store the price of the berger ?
        // You now have 3 data points namely the Berger type, its taste level and then its price. Not to worry, Scala provides Tuple3 class to achieve just this!

  val Berger = Tuple3("Grill berger","Very Tasty", 2.50)
  println(s"${Berger._1} taste level is ${Berger._2} and it's price is ${Berger._3}")


  // 4. How to use pattern matching on Tuples

    val chetanyadetails = Tuple3("Chetanya",22,45000)
    val rahuldetails = Tuple3("Rahul",25,50000)
    val maheshdetails = Tuple3("Mahesh",24,100000)

    val AllList = List(chetanyadetails,rahuldetails,maheshdetails)
    println(AllList)
    AllList.foreach(x => println(x))


  val getTheDetails = AllList.foreach { tuple => {
    tuple match {
      case ("Chetanya",age,salary) => println(s"CandidateName = Chetanya,Age = ${age}, Salary = ${salary}")
      case d if d._1 == "Rahul" => println(s"CandidateName = Rahul, Age = ${d._2}, Salary = ${d._3}")
      case _ => None
    }
  }
  }






  // 5. Shortcut for creating  Tuples

     // Using Tuples is so common that Scala has an elegant shortcut which we can use to create Tuples. You can simply enclose your data points within ()

  val grillSandwich = ("Grill Sandwich", "Very Tasty", 25)
  println(s"Grill Sandwich taste level = ${grillSandwich._2}, price = ${grillSandwich._3}")

















}
