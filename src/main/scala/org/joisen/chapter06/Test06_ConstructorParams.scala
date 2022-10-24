package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 19:47 2022/10/24 
 */
object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val stu2 = new Student2
    stu2.name = "jobi"
    stu2.age = 11
    println(s"stu2: name = ${stu2.name}, age = ${stu2.age}")

    val stu3 = new Student3("bob", 21)
    println(s"stu3: name = ${stu3.name}, age = ${stu3.age}")

    val stu4 = new Student4("angle", 23)
//    println(s"stu4: name = ${stu4.name}, age = ${stu4.age}") 报错
    stu4.printInfo()
  }
}

// 无参构造器
class Student2{
  // 单独定义属性
  var name: String = _
  var age: Int = _
}

// 上面定义等价于
class Student3(var name: String, var age: Int){
}
// 主构造器参数无修饰
class Student4(name: String,age: Int){
  def printInfo(): Unit ={
    println(s"stu4: name = ${name}, age = ${age}")
  }
}