import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

    @Test
    public void addTest(){

            assertEquals(5, Calculator.add(2,3),0);
    }

    @Test
    public void subTest(){

            assertEquals(0, Calculator.sub(3,3),0);
    }

    @Test
    public void mulTest(){

            assertEquals(9, Calculator.mul(3,3),0);
    }


    @Test
    public void divTest(){

            assertEquals(1, Calculator.div(3,3),0);
    }

}