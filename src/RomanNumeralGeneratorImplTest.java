import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class RomanNumeralGeneratorImplTest {

    RomanNumeralGeneratorImpl number;

    @Before
    public void setUp() {
        number = new RomanNumeralGeneratorImpl();
    }

    @Test
    public void canGenerateRomanString() throws UnsupportedNumberException {
        assertEquals(number.generate(1), "I");
        assertEquals(number.generate(3999), "MMMCMXCIX");
    }

    @Test
    public void canNotGenerateRomanStringLessThan1(){
        try {
            number.generate(0);
        }catch (UnsupportedNumberException e){
            assertEquals(e.getMessage(), "Number is outside of range.");
        }
    }

    @Test
    public void canNotGenerateRomanStringMoreThan3999(){
        try {
            number.generate(4000);
        }catch (UnsupportedNumberException e){
            assertEquals(e.getMessage(), "Number is outside of range.");
        }
    }




}