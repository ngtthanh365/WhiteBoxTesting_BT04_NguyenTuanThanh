package com.example;

public class Bai8 {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n >= 0");
        }
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int tong(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n > 0");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}