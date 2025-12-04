import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int result = calculator.add(2, 2);
        //Assert
        Assert.assertEquals(4, result);
    }

    @Test
    public void shouldReturnSubtractionResult_whenSubtractingTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(2, 2);

        Assertions.assertEquals(0, result);

    }

    @Test
    public void shouldReturnMultiplicationResult_whenTwoNumbersMultiplied() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(2, 2);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldReturnDivisionResult_whenTwoNumbersDivided() {
        Calculator calculator = new Calculator();

        double result = calculator.divide(2, 2);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldReturnBooleanTrue_whenNumberChecked() {
        Calculator calculator = new Calculator();

        boolean result = calculator.isEven(5);

        Assertions.assertTrue(result, "Even numbers are expected to be true");
    }

    @Test
    public void shouldReturnBooleanFalse_whenNumberChecked() {
        Calculator calculator = new Calculator();

        boolean result = calculator.isEven(5);

        Assertions.assertFalse(result, "Odd numbers are expected to be false");
    }


}