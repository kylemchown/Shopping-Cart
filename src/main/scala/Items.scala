sealed abstract class Items(quantity: Int = 1) {
  def calculatePrice(): Double
}

case class Apple(quantity: Int = 1) extends Items(quantity: Int) {
  override def calculatePrice(): Double = {
    quantity match{
      case quan if quan <= 0 => 0
      case quan if quan%2 == 0 => quan/2 * 0.6
      case quan => (quan-1)/2 * 0.6 + 0.6
    }
  }
}

case class Orange(quantity: Int = 1) extends Items(quantity: Int){
  override def calculatePrice(): Double = {
    quantity match{
      case quan if quan <= 0 => 0
      case quan if quan%3 == 0 => (quan * 2 / 3 * 0.25)
      case quan if quan%3 == 1 => ((quan-1) * 2 / 3 * 0.25) + 0.25
      case quan => ((quan-2) * 2 / 3 * 0.25) + 0.5
    }
  }
}
