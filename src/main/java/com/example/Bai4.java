package com.example;

public class Bai4 {
    public static int soNgay(int thang) {
        if (thang < 1 || thang > 12)
            throw new IllegalArgumentException();

        switch (thang) {
            case 2: return 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }
}