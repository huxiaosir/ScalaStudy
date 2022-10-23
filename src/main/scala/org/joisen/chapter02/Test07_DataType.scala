package org.joisen.chapter02

import org.joisen.chapter01.Student

/**
 * @author : joisen 
 * @date : 17:21 2022/10/22 
 */
// 数据类型
object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 整数类型
    val a1:Byte = 127
//    val a2:Byte = 128 超出范围(报错)
    val a2:Byte = -128
    println(a2)

    val a3 = 12 // 整数默认类型为Int
    val a4: Long = 12323234242342L //长整型数值定义，必须加L，不加L是先将数值以Int来处理再进行赋值
    println(a4)

    val b1:Byte = 10
    val b2:Byte = 10 + 10//虽然报错，但是能够运行
    println("b2=20:::"+b2+"  sas")

//    val b3: Byte = b1+20
    val b3: Byte = (b1+20).toByte
    println(b3)

  // 浮点类型
    val f1:Float = 1.23f
    val d1 = 23.12312

    // 字符类型
    val c1:Char = 'a'
    println(c1)
    val c2: Char = '9'
    println(c2)
// 控制字符
    val c3: Char = '\t'
    val c4: Char = '\n'
    println("abc"+c3 + "def")
    println("abc"+c4 + "def")
// 转义字符
    val c5 = '\\'
    val c6 = '\"'
    println("abc"+c5 + "def")
    println("abc"+c6 + "def")

  // 字符变量底层保存ASCII码
    val i1: Int = c1
    println("i1: ",i1)
    val i2: Int = c2
    println("i2: ",i2)

    // 空类型
    def m1():Unit ={
      println("m1被调用执行")
    }

    val a = m1()
    println(a)
//    val n: Int = null //运行报错
    var student = new Student("alice",20)
    student = null
    println(student)

    def m2(n: Int):Int={
      if(n==0)
        throw new NullPointerException
      else
        return n
    }
    val b = m2(2)
    println("b="+b)



  }
}
