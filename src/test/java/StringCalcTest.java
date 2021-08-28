import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalcTest {
    @Test
    void InputTest()
    {
        StringCalculator s1=new StringCalculator();
        assertEquals(0,s1.add(""));
        assertEquals(100,s1.add("100"));
        assertEquals(3,s1.add("1,2"));
        assertEquals(50,s1.add("10,10,10,10,10"));
        assertEquals(15,s1.add("5\n5,5"));
        assertEquals(10,s1.add("//;\n5;5"));
        assertEquals(-99,s1.add("-10,5"));
        assertEquals(-99,s1.add("//;\n-5;1"));
        assertEquals(-99,s1.add("-5,-1"));
        assertEquals(9,s1.GetCalledCount());
        assertEquals(2,s1.add("2,1001"));

    }
}
