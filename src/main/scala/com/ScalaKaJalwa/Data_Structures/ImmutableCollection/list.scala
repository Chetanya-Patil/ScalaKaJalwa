package com.ScalaKaJalwa.Data_Structures.ImmutableCollection

object list {

  def main(args: Array[String]): Unit = {

    // Step 1: Initialize an immutable List with 3 elements
    val list1: List[String] = List("Plan Berger","Grill Berger","Veg Berger")
    println(s"Elements of list1 = $list1")

    // Step 2: Access elements of immutable List at specific  index
    println(s"Element inside list at first position is = ${list1(0)}")
    println(s"Element inside list at first position is = ${list1(1)}")
    println(s"Element inside list at first position is = ${list1(2)}")

    // Step 3: Append elements at the end of immutable List

    val list2: List[String] = list1 :+ "NonVeg Berger"
    println(list2.mkString(","))


    // Step 4: Prepend elements at the front of immutable List using +:
    val list3: List[String] = "Pizza" +: list2
    println(list3.mkString(","))


    // Step 5: Add two immutable lists together using ::
    val list4: List[Any] = list2 :: list3
    println(list4)

    // Note: Using :: returns a new List(List(...), elements from the second list)


    // Step 6: Add two immutable Lists toghether using :::
    val list5: List[String] = list2 ::: list3
    println(list5)

    // Step 7: Initialize an empty immutable List

    val emptyList: List[String] = List.empty[String]
    println(s"Empty list = $emptyList")                         //Empty list = List()





  }

}
