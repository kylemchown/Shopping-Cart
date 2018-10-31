object Runner {
  def main(args: Array[String]): Unit = {
    println(Calculate.calculate(Apple(), Orange(), Apple()))
    println(Calculate.calculateWithDiscount(Apple(5), Orange(3)))
  }
}
