package org.joisen.chapter02

/**
 * @author : joisen 
 * @date : 16:44 2022/10/22 
 */
// 字符串
object Test04_String {
  def main(args: Array[String]): Unit = {
//    （1）字符串，通过+号连接
    val name:String = "alice"
    val age:Int = 18
    println(age+"岁的"+name+"在PKU学习")
    //* 用于将一个字符串复制多次并拼接
    println(name * 3)
//    （2）printf 用法：字符串，通过%传值。
    printf("%d岁的%s在PKU学习 \n",age,name)
//    （3）字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在PKU学习")
    val num:Double = 2.3456
    println(s"The number is ${num}")
    println(f"The number is ${num}%2.2f")// 格式化模板字符串
    println(raw"The number is ${num}%2.2f")

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql = s"""
      |select
      | *
      |from
      | student
      |where
      | name = ${name}
      |and
      | age > ${age}
      |""".stripMargin
    println(sql)

  }
}
