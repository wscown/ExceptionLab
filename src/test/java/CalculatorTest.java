import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wscown on 2/16/16.
 */
public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals("Calculator add method not working as expected", 100, Calculator.add(25,75));
        assertEquals("Calculator add method not working as expected", 50, Calculator.add(40,10));
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals("Calculator subtract method not working as expected", -50, Calculator.subtract(25,75));
        assertEquals("Calculator subtract method not working as expected", 30, Calculator.subtract(40,10));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals("Calculator multiply method not working as expected", -1875, Calculator.multiply(25,-75));
        assertEquals("Calculator multiply method not working as expected", 400, Calculator.multiply(40,10));
    }

    @Test
    public void testDivide() throws Exception {
        assertTrue("Calculator divide method not working as expected", -1f == Calculator.divide(25,-25));
        assertTrue("Calculator divide method not working as expected", 4f == Calculator.divide(40,10));
    }

    @Test(expected = DivisionbyZeroException.class)
    public void testDivideEx() throws DivisionbyZeroException{
        Calculator.divide(2,0);
    }

    @Test(expected = ComplexNumberException.class)
    public void testSquareRoot() throws ComplexNumberException{
        Calculator.squareRoot(-1);
    }
}