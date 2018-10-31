object Calculate {
  def calculate(items: Items*): Double = {
    items.map(item => item match{
      case apple: Apple => 0.6
      case orange: Orange => 0.25
      case _ => 0
    }).sum
  }
}
