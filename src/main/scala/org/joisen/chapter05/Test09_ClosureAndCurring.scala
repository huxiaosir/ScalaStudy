package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 11:23 2022/10/24 
 */
object Test09_ClosureAndCurring {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int):Int = {
      a + b
    }

    // 考虑固定一个加数的场景
    def addByFour(b: Int):Int = {
      b + 4
    }
    // 扩展固定加数改变的情况
    def addByFive(b: Int):Int = {
      b + 5
    }

    // 将固定加数作为另一个参数传入，但是是作为“第一层参数”传入
    def addByFour1(): Int => Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }
    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }
    println(addByA(12)(21))

    val addBy4 = addByA(4)
    val addBy5 = addByA(5)
    println(addBy4(5))
    println(addBy5(3))

    println("====================")
    // lambda表达式简写
    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }
    def addByA2(a: Int): Int => Int ={
      b => a + b
    }
    def addByA3(a: Int): Int => Int = a + _

    val addBy4_1 = addByA3(4)
    val addBy5_1 = addByA3(5)
    println(addBy4_1(5))
    println(addBy5_1(4))

    println("==================")
    // 柯里化
    def addCurring(a: Int)(b: Int): Int = {
      a + b
    }
    println(addCurring(35)(24))

  }
}
