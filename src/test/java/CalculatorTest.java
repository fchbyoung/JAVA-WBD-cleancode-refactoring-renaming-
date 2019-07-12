import com.codegym.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = Calculator.calculate(1, 2, '+');
        assertEquals(3, result);
    }

    @Test
    public void testSubtraction() {
        int result = Calculator.calculate(3, 2, '-');
        assertEquals(1, result);
    }

    @Test
    public void testMultiplication() {
        int result = Calculator.calculate(3, 2, '*');
        assertEquals(6, result);
    }

    @Test
    public void testDivision() {
        int result = Calculator.calculate(4, 2, '/');
        assertEquals(2, result);
    }

}
