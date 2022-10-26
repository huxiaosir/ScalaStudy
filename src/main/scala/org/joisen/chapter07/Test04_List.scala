package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 11:15 2022/10/26 
 */
object Test04_List {
  def main(args: Array[String]): Unit = {
    // 创建一个List
    val list1 = List(12,23,34)
    println(list1)
//    list1(1) = 122  error
    println(list1(1))
    list1.foreach(println)

    // 添加元素
    val list2 = 10 +: list1
    val list3 = list1 :+ 45
    println(list1)
    println(list2)
    println(list3)

    println("-------------------")

    val list4 = list2.::(51)
    println(list4)

    val list5 = Nil.::(51)
    println(list5)

    val list6 = 32 :: Nil
    val list7 = 12 :: 23 :: 43 :: 41 :: Nil
    println(list6)
    println(list7)

    // 合并列表
    val list8 = list6 :: list7
    println(list8)

    val list9 = list6 ::: list7
    println(list9)
    val list10 = list6 ++ list7
    println(list10)



  }
}
