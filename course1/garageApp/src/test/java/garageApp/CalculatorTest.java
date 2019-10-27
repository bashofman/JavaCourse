package garageApp;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

  //  public CalculatorTest(){
  //      this.calculator = new Calculator();
  //  }

    @Test
    public void testSum(){
        this.calculator = new Calculator();
        int result = this.calculator.sum(4, 3);
        Assert.assertEquals(7, result);
    }


}
