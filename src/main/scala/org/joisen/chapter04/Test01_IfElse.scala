package org.joisen.chapter04

import scala.io.StdIn

/**
 * @author : joisen 
 * @date : 10:57 2022/10/23 
 */
object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("输入年龄： ")
    val age = StdIn.readInt()

    // 条件分支的返回值  当需要多种类型的返回值时需要指定多种返回值的公共父类：比如int和string的公共父类any
    val result: String = if(age <= 6){
      println("童年")
      "童年"
    }else if(age < 18){
      println("青少年")
      "青少年"
    }else if(age <35){
      println("青年")
      "青年"
    }else if(age < 60){
      println("中年")
      "中年"
    }else{
      println("老年")
      "老年"
    }
    println("result: "+result)

    // java中三元运算符
    val res: String = if (age>=18){
      "成年"
    }else{
      "未成年"
    }
    val res2 = if(age >= 18) "成年" else "未成年"
    println("res= "+res)
    println("res2= "+res2)



  }



}
