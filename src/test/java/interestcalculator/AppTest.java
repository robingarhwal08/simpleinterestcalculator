package interestcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testSimpleInterest()
    {
        App obj = new App();

        double result = obj.calculateSimpleInterest(10000, 5, 2);

        assertEquals(1000.0, result, 0.0);
    }

    @Test
    public void testZeroPrincipal()
    {
        App obj = new App();

        double result = obj.calculateSimpleInterest(0, 5, 2);

        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testZeroRate()
    {
        App obj = new App();

        double result = obj.calculateSimpleInterest(10000, 0, 2);

        assertEquals(0.0, result, 0.0);
    }
}