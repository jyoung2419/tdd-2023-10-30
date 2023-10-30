package com.ll;

public class Calc {
    public static int run(String exp) {
        if (exp.isBlank()) return 0;

        if (exp.contains("-")) return 0;

        String[] exps = exp.split(" \\+ ");

        int num1 = Integer.parseInt(exps[0]);
        int num2 = Integer.parseInt(exps[1]);

        return num1 + num2;
    }
}