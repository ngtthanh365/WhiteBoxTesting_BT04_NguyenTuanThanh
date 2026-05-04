package com.example;

public class Bai1 {
    public static double chuVi(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException();
        return 2 * (a + b);
    }
}