package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 13:02 2022/10/24 
 */
object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 传值参数
    def f0(a: Int): Unit = {
      println("a: "+a)
      println("a: "+a)
    }
//    f0(2)

    def f1(): Int = {
      println("f1 调用")
      11
    }
    f0(f1())


    println("==================")
    // 传名参数
    def f2(a: => Int):Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    f2(f1())
    println("==================")
    f2(2)
    println("==================")
    f2({
      println("code block")
      21
    })

  }

}
