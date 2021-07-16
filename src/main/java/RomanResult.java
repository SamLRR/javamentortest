package main.java;

import main.java.util.ConverterArabianToRoman;
import main.java.util.RomanNumber;

public class RomanResult {
    private ArabianResult arabianResult;

    public void setArabianResult(ArabianResult arabianResult) {
        this.arabianResult = arabianResult;
    }

    public String getResult(String firstNumber, String sign, String secondNumber) {
        int number1 = RomanNumber.getNumber(firstNumber);
        int number2 = RomanNumber.getNumber(secondNumber);
        int resultInArabian = arabianResult.getResult(number1, number2, sign);
        String resultInRoman = ConverterArabianToRoman.getResultInRoman(resultInArabian);
        return resultInRoman;
    }
}
