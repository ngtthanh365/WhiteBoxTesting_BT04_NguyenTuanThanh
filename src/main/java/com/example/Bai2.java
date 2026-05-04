package com.example;

public class Bai2 {
    public static double dienTich(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException();
        return a * b;
    }
}