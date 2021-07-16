package main.java;

public class ArabianResult {

    public int getResult(int number1, int number2, String sign) {
        int result = 0;
        switch (sign) {
            case ("+"):
                result = number1 + number2;
                break;
            case ("-"):
                result = number1 - number2;
                break;
            case ("*"):
                result = number1 * number2;
                break;
            case ("/"):
                result = number1 / number2;
                break;
        }
        return result;
    }
}
