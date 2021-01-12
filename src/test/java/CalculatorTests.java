import Calculator.Minus;
import Calculator.Multiply;
import Calculator.Plus;
import Calculator.Split;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void TestingAdditionMethod(){

        Plus result = new Plus(12, 35);
        result.calculateResult();
        assertEquals("Invalid value for the sum of two numbers:",47.0,result.getResult(),0.0001);
    }

    @Test
    public void TestingSubtractionMethod(){
        Minus result = new Minus(23.56, 13.35);
        result.calculateResult();
        assertEquals("Invalid value for the difference of two numbers:",10.21,result.getResult(),0.0001);
    }

    @Test
    public void TestingMultiplicationMethod(){

        Multiply result = new Multiply(23.45, 9 );
        result.calculateResult();
        assertEquals("Invalid value for multiplying two numbers:",211.05,result.getResult(),0.0001);
    }

    @Test
    public void TestingSplitMethod(){

        Split result = new Split(406.476, 9);
        result.calculateResult();
        assertEquals("Invalid value for division operation:",45.164,result.getResult(),0.0001);
    }

    @Test
    public void DivisionByZeroTest(){

        Split result = new Split(406.476, 0);
        result.divisionByZero();
        assertEquals("Error checking that the second number is zero:",false, result.divisionByZero());
    }
}
