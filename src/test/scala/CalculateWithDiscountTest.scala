class CalculateWithDiscountTest extends BaseTest {
  "Entering no items" should "return 0" in{
    Calculate.calculateWithDiscount() should equal (0)
  }

  "Entering 1 apple" should "return 0.6" in {
    Calculate.calculateWithDiscount(Apple(1)) should equal (0.6)
  }

  "Entering 2 apples" should "return 0.6" in{
    Calculate.calculateWithDiscount(Apple(2)) should equal (0.6)
  }

  "Entering 3 apples" should "return 1.2" in{
    Calculate.calculateWithDiscount(Apple(3)) should equal (1.2)
  }

  "Entering 1 orange" should "return 0.25" in {
    Calculate.calculateWithDiscount(Orange(1)) should equal (0.25)
  }

  "Entering 2 oranges" should "return 0.5" in{
    Calculate.calculateWithDiscount(Orange(2)) should equal (0.5)
  }

  "Entering 3 oranges" should "return 0.5" in{
    Calculate.calculateWithDiscount(Orange(3)) should equal (0.5)
  }

  "Entering 4 oranges" should "return 0.75" in{
    Calculate.calculateWithDiscount(Orange(4)) should equal (0.75)
  }

  "Entering a combination of items" should "return the sum of each type's total" in{
    Calculate.calculateWithDiscount(Apple(1), Orange(1)) should equal (0.85)
    Calculate.calculateWithDiscount(Apple(2), Orange(3)) should equal (1.1)
    Calculate.calculateWithDiscount(Apple(2), Orange(4)) should equal (1.35)
    Calculate.calculateWithDiscount(Apple(3), Orange(3)) should equal (1.7)
    Calculate.calculateWithDiscount(Apple(8), Orange(7)) should equal (3.65)
    Calculate.calculateWithDiscount(Apple(5), Orange(9)) should equal (3.3)
  }
}
