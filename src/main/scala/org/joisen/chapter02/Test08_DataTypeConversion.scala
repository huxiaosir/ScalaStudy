package org.joisen.chapter02

/**
 * @author : joisen 
 * @date : 19:34 2022/10/22 
 */
// 类型转换
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型
    //  然后再进行计算
    val a1: Byte = 10
    val b1: Long = 2331
    val result1: Long = a1+b1
    val result2: Int = (a1+b1).toInt // 强转
    println("result1:"+result1)
    println("result2:"+result2)
    // 2) 把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
//    val c2: Byte = b2   报错

    // 3) （byte,short）和char之间不会相互自动转换
    val a3:Byte = 10
    val b3:Char = 'b'
//    val c3:Byte = b3  运行报错
    val c3:Int = b3
    println(c3)

    // 4) byte、short、char三者可以计算，在计算时首先转换成int类型
    val a4:Byte = 12
    val b4:Short = 25
    val c4:Char = 'c'
    val result4:Int = a4+b4
    val result5:Int = a4+b4+c4
    println(result4)
    println(result5)



    // 强制类型转换
    // （1）将数据由高精度转换为低精度，就需要使用到强制转换
    val n1: Int = 2.9.toInt
    println("n1: "+n1)
    // （2）强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = 2.6.toInt+3.7.toInt
    println("n2: "+n2)
    val  n3: Int = (2.6+3.7).toInt
    println("n3: "+n3)

    // 数值类型和String类型
    // 数值转String
    val nn:Int = 21
    val ss:String = nn + ""
    println("ss: "+ss)
    // String转数值
    val mm:Int = "12".toInt
    val ff:Float = "12.3".toFloat
//    val ff2:Int = "12.3".toInt  //运行报错，可以先转Float在转Int
    println("mm: "+mm)
    println("ff: "+ff)
//    println("ff2: "+ff2)




  }

}
