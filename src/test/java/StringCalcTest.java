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
    }
}
