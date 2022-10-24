package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 10:48 2022/10/24 
 */
object Test08_Practice {
  def main(args: Array[String]): Unit = {
    // 练习1
    val fun = (i: Int, s: String, c: Char) => { if(i == 0 && s =="" && c == '0') false else true }

    println(fun(0,"",'0'))
    println(fun(0,"",'1'))
    println(fun(112,"",'0'))
    println(fun(0,"sd",'0'))


    println("==================")
    // 练习2
    // func 的输入是Int，返回值是以String为输入，返回值是一个以Char为输入Boolean为返回值的函数的函数
    def func(i: Int): String=>(Char=>Boolean) = {
      // f1 的输入是String 返回值是一个 以Char作为输入，Boolean为返回值的函数
      def f1(s: String): Char=> Boolean ={
        // f2 的输入是Char 返回值是Boolean
        def f2(c: Char): Boolean = {
          if(i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))
    println(func(1)("")('0'))
    println(func(0)("g")('0'))
    println(func(0)("")('1'))


    println("==================")
    // 匿名函数简写
    def func1(i: Int): String=>(Char=>Boolean) = {
      s => c=> if(i == 0 && s == "" && c == '0') false else true
    }
    println(func1(0)("")('0'))
    println(func1(1)("")('0'))
    println(func1(0)("g")('0'))
    println(func1(0)("")('1'))


    println("==================")
    // 柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(func2(0)("")('0'))
    println(func2(1)("")('0'))
    println(func2(0)("g")('0'))
    println(func2(0)("")('1'))


  }

}
