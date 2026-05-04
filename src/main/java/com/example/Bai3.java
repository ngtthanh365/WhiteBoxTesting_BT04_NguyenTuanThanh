package com.example;

public class Bai3 {
    public static String solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) return "Vo nghiem";
            return "Mot nghiem";
        }

        double delta = b*b - 4*a*c;

        if (delta < 0) return "Vo nghiem";
        if (delta == 0) return "Nghiem kep";
        return "Hai nghiem";
    }
}