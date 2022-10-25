package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 15:52 2022/10/25 
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("bob","qqq")
    user.insert()
  }

}

class User(val name: String,val password: String)

trait UserDao{
  _: User => // 自身类型
  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}

// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao

