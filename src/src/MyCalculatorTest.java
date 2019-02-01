import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

    Calculator prueba = new MyCalculator();

    @Test
    public void calculate() {
        assertEquals(prueba.calculate(1,2,"+"),3);
        assertEquals(prueba.calculate(1,5,"*"),5);
        assertEquals(prueba.calculate(6,2,"-"),4);
        assertEquals(prueba.calculate(3,1,"/"),3);
    }



}