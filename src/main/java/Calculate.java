package main.java;

import main.java.util.CheckInputData;
import main.java.util.SignOperations;

import java.util.Scanner;

public class Calculate {
    private ArabianResult arabianResult;
    private RomanResult romanResult;
    private String[] arr;
    private Scanner scanner;

    public Calculate() {
        this.arabianResult = new ArabianResult();
        this.romanResult = new RomanResult();
        this.romanResult.setArabianResult(arabianResult);

        scanner = new Scanner(System.in);
        System.out.println("Введите выражение для вычисления");
        String expression = scanner.nextLine();
        arr = expression.split(" ");
        start();
    }

    private void start() {
        String firstNumber = arr[0];
        String sign = arr[1];
        String secondNumber = arr[2];

        SignOperations.checkSign(sign);

        if (Character.isDigit(firstNumber.charAt(0))
                && Character.isDigit(secondNumber.charAt(0))) {
            if (CheckInputData.isArabianNumber(firstNumber, secondNumber)) {

                int first = Integer.parseInt(firstNumber);
                int second = Integer.parseInt(secondNumber);
                System.out.println(arabianResult.getResult(first, second, sign));
            }
        } else if (CheckInputData.isRomanNumber(firstNumber, secondNumber)) {
            System.out.println(romanResult.getResult(firstNumber, sign, secondNumber));
        }
    }
}