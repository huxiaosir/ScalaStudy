package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 18:52 2022/10/23 
 */
// 高阶函数
object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用...")
      n + 1
    }
    val result: Int = f(123)
    println(result)

    println("====================")
    // 函数作为值进行传递
    val f1:Int => Int = f
    val f2 = f _ // 表示函数f的函数体
    println(f1)
    println(f1(12))
    println(f2)
    println(f2(21))

    println("====================")
    // 函数作为参数进行传递
    //定义二元计算函数
    def dualEval(op: (Int, Int)=> Int,a:Int,b:Int): Int = {
      op(a,b)
    }
    def add(a: Int, b: Int): Int = {
      a + b
    }
    println(dualEval(add,1,2))









  }
}
