package roman_numeral;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by elegg on 2/13/17.
 */
public class RomanNumeralEnumTests {
    @Test
    public void testReturnStringValuesForIntParams() {
        assertEquals("I", RomanNumeralEnum.getStringForInt(1));
        assertEquals("IV", RomanNumeralEnum.getStringForInt(4));
        assertEquals("V", RomanNumeralEnum.getStringForInt(5));
        assertEquals("IX", RomanNumeralEnum.getStringForInt(9));
        assertEquals("X", RomanNumeralEnum.getStringForInt(10));
        assertEquals("M", RomanNumeralEnum.getStringForInt(1000));
    }

    @Test
    public void testReturnIntValuesForStringParams() {
        assertEquals(1, RomanNumeralEnum.getIntForString("I"));
        assertEquals(4, RomanNumeralEnum.getIntForString("IV"));
        assertEquals(5, RomanNumeralEnum.getIntForString("V"));
        assertEquals(9, RomanNumeralEnum.getIntForString("IX"));
        assertEquals(10, RomanNumeralEnum.getIntForString("X"));
        assertEquals(1000, RomanNumeralEnum.getIntForString("M"));
    }

}
