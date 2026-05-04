package com.example;

public class Bai6 {
    public static int tong(int n) {
        if (n < 1) throw new IllegalArgumentException();

        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) s -= i;
            else s += i;
        }
        return s;
    }
}