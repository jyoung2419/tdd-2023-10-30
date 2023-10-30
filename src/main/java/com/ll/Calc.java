package com.ll;

public class Calc {
    public static int run(String exp) {
        if (exp.isBlank()) return 0;

        final String[] expBits = exp.split(" ");
        final String sign = expBits[1];

        final int num1 = Integer.parseInt(expBits[0]);
        final int num2 = Integer.parseInt(expBits[2]);

        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                return num1 * num2;
        }
    }
}