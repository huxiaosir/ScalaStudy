package org.joisen.chapterOther

/**
 * @author : joisen 
 * @date : 16:10 2022/10/27 
 */
object Test02_Implicit {
  def main(args: Array[String]): Unit = {

    val new12 = new MyRichInt(12)
    println(new12.myMax(15))

    // 隐式转换函数，实现 12.myMax() 函数调用，因为12不是MyRichInt类型，故需要进行转换使得12也能调用MyRichInt中的函数
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)
    println(12.myMin(15))

    println("-=-=-=-=-=-=-=-=-=-=-==-=-=-==")

    // 隐式类  只能定义在某个类或者对象内部，不能定义在外面
    implicit class MyRichInt2(val self: Int){
      // 自定义比较大小的方法
      def myMax2(n: Int): Int = if (n<self) self else n
      def myMin2(n: Int): Int = if (n<self) n else self
    }
    println(12.myMax2(22))


    println("-=-=-=-=-=-=-=-=-=-=-==-=-=-==")
    //隐式参数
    implicit val str: String = "Joisen" // 同一作用域范文内  隐式参数只能有一个
    implicit val num: Int = 18
    def sayHello()(implicit name: String): Unit = {
      println("Hello, "+ name)
    }
    def sayHi()(implicit name: String): Unit = {
      println("Hi, "+ name)
    }
    sayHello()
    sayHi

    // 简便写法
    def hiAge():Unit= {
      println("hi, " + implicitly[Int])
    }
    hiAge()







  }
}

class MyRichInt(val self: Int){
  // 自定义比较大小的方法
  def myMax(n: Int): Int = if (n<self) self else n
  def myMin(n: Int): Int = if (n<self) n else self

}
