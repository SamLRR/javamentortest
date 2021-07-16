package main.java.util;

import main.java.exception.IllegalArithmeticOperationException;

public class SignOperations {

    public static void checkSign(String sign) {
        try {
            if (!isArithmeticOperation(sign)) {
                throw new IllegalArithmeticOperationException();
            }

        } catch (IllegalArithmeticOperationException e) {
            e.printStackTrace();
            return;
        }
    }
    private static boolean isArithmeticOperation(String sign) {
        return (sign.equals("+")
                || sign.equals("-")
                || sign.equals("*")
                || sign.equals("/"));
    }

}
