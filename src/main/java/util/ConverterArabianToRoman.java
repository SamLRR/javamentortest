package main.java.util;

public class ConverterArabianToRoman {
    public static String getResultInRoman(int result) {
        String romanString;
        if (result < 10) {
            return RomanNumber.getString(result).replaceAll("\\[", "").replaceAll("\\]","");
        }
        romanString = RomanNumber.getString(result - result % 10)
                + RomanNumber.getString(result % 10);

        return romanString.replaceAll("\\[", "").replaceAll("\\]","");

    }
}
