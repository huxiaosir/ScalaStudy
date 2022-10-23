package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 16:35 2022/10/23 
 */
object Test02_FuncParameter {
  def main(args: Array[String]): Unit = {
    //    （1）可变参数
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("alice")
    f1("a","b","c")

    println("==========================")
    //    （2）如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1 = "+ str1 + ", str2 = " + str2)
    }
    f2("alice")
    f2("a","b","c")
    println("==========================")
    //    （3）参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name: String = "NCU"): Unit = {
      println("i am in " + name)
    }
    f3()
    f3("PKU")
    println("==========================")
    //    （4）带名参数
    def f4(name: String, age: Int): Unit ={
      println(s"${age}岁的${name}")
    }
    f4("alice",22)
    f4(age=21,name="joisen")



  }

}
