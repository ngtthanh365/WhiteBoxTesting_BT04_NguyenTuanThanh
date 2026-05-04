package com.example;

public class Bai7 {
    public static int ucln(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("a,b > 0");
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
