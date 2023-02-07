import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void test_canAddTwoNumbers(){
        int result = calculator.addTwoNumbers(2, 4);
        Assertions.assertEquals(result, 6);
    }

    @Test
    public void test_canDivideTwoNumbers(){
        int result = calculator.divideTwoNumbers(2, 4);
        Assertions.assertEquals(result, 0.5);
    }

    @Test
    public void test_canSubtractTwoNumbers(){
        int result = calculator.subtractTwoNumbers(2, 4);
        Assertions.assertEquals(result, -2);
    }
}