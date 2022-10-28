package org.joisen.chapter08

/**
 * @author : joisen 
 * @date : 11:07 2022/10/27 
 */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    // 定义基本语法
    val x: Int = 2
    val y: String = x match{
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    // 用模式匹配实现简单二元运算
    val a = 25
    val b = 13

    def matchDualOp(op: Char) = op match{
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case '_' => -1
    }
    println(matchDualOp('-'))

    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    // 模式守卫
    // 求一个整数的绝对值
    def abs(num : Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }
    println(abs(-1))
    println(abs(0))
    println(abs(1))

  }
}
