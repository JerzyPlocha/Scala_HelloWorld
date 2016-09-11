/**
  * Author: Jerzy Plocha on 11/09/16.
  */
object App {
  def main(args: Array[String]): Unit = {
    val helloWorld = new HelloWorld("Hello World!")
    print(helloWorld.name())
  }
}
