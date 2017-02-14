package roman_numeral;

public class RomanNumeralConverter {

    public static long romanNumeralToArabicNumber(String s) {
        long arabic = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            arabic += getValueOfRomanNumeralSet(s.charAt(i), s.charAt(i + 1));
        }
        arabic += getValueOfRomanNumeral(s.charAt(s.length() - 1));
        return arabic;
    }

    private static int getValueOfRomanNumeralSet(char a, char b) {
        int firstLetter = RomanNumeralEnum.getIntForString(Character.toString(a));
        int secondLetter = RomanNumeralEnum.getIntForString(Character.toString(b));
        return firstLetter < secondLetter ? -(firstLetter) : firstLetter;
    }

    private static int getValueOfRomanNumeral(char a) {
        return RomanNumeralEnum.getIntForString(Character.toString(a));
    }


    public static String arabicNumberToRomanNumeral(long l) {
        long temp = l;
        StringBuilder sb = new StringBuilder();
        for (RomanNumeralEnum e : RomanNumeralEnum.values()) {
            while (temp >= e.getIntValue()) {
                sb.append(e.getStringValue());
                temp -= e.getIntValue();
            }
        }
        return sb.toString();
    }
}
