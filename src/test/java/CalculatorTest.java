import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;
//    private Calculator testCalculator2;

    @Before
    public void before() {
        testCalculator = new Calculator(5, 4);
    }

    @Test
    public void getAdd(){
        assertEquals(9, testCalculator.add());
    }

    @Test
    public void getSubtract(){
        assertEquals(1, testCalculator.subtract());
    }

    @Test
    public void getMultiply(){
        assertEquals(20, testCalculator.multiply());
    }

    @Test
    public void getDivide(){
        assertEquals(1, testCalculator.divide());
    }
}

