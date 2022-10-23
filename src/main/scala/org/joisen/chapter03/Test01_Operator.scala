package org.joisen.chapter03

/**
 * @author : joisen 
 * @date : 9:46 2022/10/23 
 */
// 运算符
object Test01_Operator {
  def main(args: Array[String]): Unit = {
    //算术运算符
    val result1 = 10/3
    println(result1)
    val result2: Double = 10/3
    println(result2)
    val result3: Double = 10.0/3
    println(result3)
    println(result3.formatted("%5.3f"))

    // 比较运算符
    /**
     * Java：
     *      ==比较两个变量本身的值，即两个对象在内存中的首地址；
     *      equals 比较字符串中所包含的内容是否相同。
     * Scala：==更加类似于 Java 中的 equals,  eq()--引用类型比较内存地址
     **/
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2) //
    println(s1.equals(s2))
    println(s1.eq(s2))

    println("======================")
    // 逻辑运算符
    def m(n: Int): Int = {
      println("m 被调用...")
      return n
    }

    val n = 1
    println((3>4)&&m(n)>0) // 短路
    println((3>4)&m(n)>0)

    // 判断一个字符串是否为空
    def isNotEmpty(str: String):Boolean ={
//      return !(str == "")// 当传入null时 返回true  逻辑不对
      return str != null && !("".equals(str.trim))
    }
    println(isNotEmpty(""))
    println("========================")

    // 赋值运算符
    var b:Byte = 10
//    b += 1  报错
    var i:Int = 13
    i += 1
    println(i)

    // 位运算符
    val a = 60 // 若a位byte类型，再位移之后会自动转换为int
    println( a << 3)
    println( a >> 2)

    val bb: Short = -13
    println(bb << 2)
    println(bb >> 2)
    println(bb >>> 2)

    // 运算符的本质: 对象方法的调用
    val n1: Int = 12
    val n2: Int = 37
    println(n1.+(n2))
    // （1）当调用对象的方法时，.可以省略
    // （2）如果函数参数只有一个，或者没有参数，()可以省略
    println(n1 + n2)
    println(1.34.*(25))
    println(1.34*25)
    println(7.5 toString)

  }
}
