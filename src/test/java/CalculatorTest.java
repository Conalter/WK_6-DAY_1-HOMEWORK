import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator();
    }

    @Test
    public void getAdd(){
        assertEquals(9, testCalculator.add(5, 4));
    }

    @Test
    public void getSubtract(){
        assertEquals(1, testCalculator.subtract(5, 4));
    }

    @Test
    public void getMultiply(){
        assertEquals(20, testCalculator.multiply(5,4));
    }

    @Test
    public void getDivide(){
        assertEquals(1, testCalculator.divide(5,4), 0.1);
    }
}

