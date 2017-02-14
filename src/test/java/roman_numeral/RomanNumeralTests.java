package roman_numeral;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralTests {
    @Test
    public void testThatEachLetterReturnsTheCorrectNumber() {
        assertEquals(1, RomanNumeralConverter.romanNumeralToArabicNumber("I"));
        assertEquals(5, RomanNumeralConverter.romanNumeralToArabicNumber("V"));
        assertEquals(10, RomanNumeralConverter.romanNumeralToArabicNumber("X"));
        assertEquals(50, RomanNumeralConverter.romanNumeralToArabicNumber("L"));
        assertEquals(100, RomanNumeralConverter.romanNumeralToArabicNumber("C"));
        assertEquals(500, RomanNumeralConverter.romanNumeralToArabicNumber("D"));
        assertEquals(1000, RomanNumeralConverter.romanNumeralToArabicNumber("M"));
    }

    @Test
    public void testThatNumeralsAreCorrectlyAddedTogether() {
        assertEquals(20, RomanNumeralConverter.romanNumeralToArabicNumber("XX"));
    }

    @Test
    public void testThatNumeralsAreCorrectlySubtracted() {
        assertEquals(4, RomanNumeralConverter.romanNumeralToArabicNumber("IV"));
    }

    @Test
    public void testConverterReturnsMMMfor2000() {
        assertEquals("MM", RomanNumeralConverter.arabicNumberToRomanNumeral(2000));
    }

    @Test
    public void testConverterReturnsMCMfor1900() {
        assertEquals("MCM", RomanNumeralConverter.arabicNumberToRomanNumeral(1900));
    }

    @Test
    public void testConverterReturnsMDfor1500() {
        assertEquals("MD", RomanNumeralConverter.arabicNumberToRomanNumeral(1500));
    }

    @Test
    public void testCases() {
        assertEquals("I", RomanNumeralConverter.arabicNumberToRomanNumeral(1));
        assertEquals("III", RomanNumeralConverter.arabicNumberToRomanNumeral(3));
        assertEquals("IX", RomanNumeralConverter.arabicNumberToRomanNumeral(9));
        assertEquals("MLXVI", RomanNumeralConverter.arabicNumberToRomanNumeral(1066));
        assertEquals("MCMLXXXIX", RomanNumeralConverter.arabicNumberToRomanNumeral(1989));
    }
}
