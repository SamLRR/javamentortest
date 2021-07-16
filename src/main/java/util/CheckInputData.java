package main.java.util;

import main.java.exception.IllegalNumberException;

public class CheckInputData {

    public static boolean isArabianNumber(String firstNumber, String secondNumber) {

        if (firstNumber == null || secondNumber == null) {
            return false;
        }

        int first = 0;
        int second = 0;

        try {
            first = Integer.parseInt(firstNumber);
            second = Integer.parseInt(secondNumber);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if (!isInRangeOneToTen(first, second)) {
            try {
                throw new IllegalNumberException();
            } catch (IllegalNumberException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public static boolean isRomanNumber(String firstNumber, String secondNumber) {
        int first = RomanNumber.getNumber(firstNumber);
        int second = RomanNumber.getNumber(secondNumber);
        if (!isInRangeOneToTen(first, second)) {
            try {
                throw new IllegalNumberException();
            } catch (IllegalNumberException e) {
                e.printStackTrace();
            }
        }

        return RomanNumber.romanMap.containsKey(firstNumber)
                & RomanNumber.romanMap.containsKey(secondNumber);
    }

    private static boolean isInRangeOneToTen(int first, int second) {
        return ((first > 0 & first < 11) & (second > 0 & second < 11));
    }
}
