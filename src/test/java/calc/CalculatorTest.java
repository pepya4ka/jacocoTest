package calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * todo Document type CalculatorTest
 */
public class CalculatorTest {

    @Test
    public void aPlusB() {

        assertEquals(2, Calculator.aPlusB(1, 1));

    }
}