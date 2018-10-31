class CalculateTest extends BaseTest {
  "Entering no items" should "return 0" in{
    Calculate.calculate() should equal (0)
  }

  "Entering one apple" should "return 0.6" in{
    Calculate.calculate(Apple()) should equal (0.6)
  }

  "Entering one orange" should "return 0.25" in{
    Calculate.calculate(Orange()) should equal (0.25)
  }

  "Entering a combination of items" should "return the sum of their individual prices" in{
    Calculate.calculate(Apple(), Orange()) should equal (0.85)
    Calculate.calculate(Apple(), Apple(), Orange(), Apple(), Orange()) should equal (2.3)
    Calculate.calculate(Orange(), Apple(), Apple(), Orange()) should equal (1.7)
  }
}
