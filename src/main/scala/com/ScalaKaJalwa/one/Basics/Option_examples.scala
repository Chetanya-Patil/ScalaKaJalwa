package com.ScalaKaJalwa.one.Basics

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode

object Option_examples {

  println("Welcome to the Scala Worksheet")

  val s1: String = "Chetanya"
  val s2: String = null

  println(s1.length)                // will print 8 as output
  //println(s2.length)                // Here, it will raise java.lang.NullPointerException becoz of it's value as null

  // So to tackle such type of situation scala is providing something called Options
  // Let do some modification

  val p1: Option[String] = Some("Chetanya")
  val p2: Option[String] = None

  //option class doesn't have this length function so for that we have to use map

  println(p1.map(_.length))                       // Option[Int] = Some(7)
  println(p2.map(_.length))                       // Option[Int] = None


  // To avoid getting nullPointerException we use Option class mainly.

  val map_A = Map('A' -> "Apple", 'B' -> "Banana", 'C' -> "chikoo")

  println(map_A('A'))
  //println(map_A('D'))               // Here, again we will get java.util.NoSuchElementException Key not found D.
                                    // It is same like NullPointerException only


  // So instead of using above method we will be using get method to call

  println(map_A.get('A'))             // Option[String] = Some(Apple)
  println(map_A.get('D'))             // Option[String] = None    // Instead of returning NoSuchElementException it prints None because of options.

  // So whenever we are working with Map in our scala code instead of using directly map_A('Key') try using get method fo resolving the nullpointerexcpetion or NoSuchElementException.

  val case1 = map_A.get('E')

  case1 match {
    case Some(case1) => println(case1)
    case None => println("Not Present")
  }




  def main(args: Array[String]): Unit = {

  }

}
