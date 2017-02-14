package roman_numeral;

public enum RomanNumeralEnum {
    M("M", 1000),
    CM("CM", 900),
    D("D", 500),
    CD("CD", 400),
    C("C", 100),
    XC("XC", 90),
    L("L", 50),
    XL("XL", 40),
    X("X", 10),
    IX("IX", 9),
    V("V", 5),
    IV("IV", 4),
    I("I", 1);

    private final String stringValue;
    private final int intValue;
    RomanNumeralEnum(String s, int v) {
        stringValue = s;
        intValue = v;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static int getIntForString(String s) {
        for (RomanNumeralEnum e : values()) {
            if (e.getStringValue().equals(s)) {
                return e.getIntValue();
            }
        }
        return 0;
    }

    public static String getStringForInt(int i) {
        for (RomanNumeralEnum e : values()) {
            if (e.getIntValue() == i) {
                return e.getStringValue();
            }
        }
        return null;
    }

}
