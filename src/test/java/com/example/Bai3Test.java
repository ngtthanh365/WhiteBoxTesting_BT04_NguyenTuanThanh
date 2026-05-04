package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai3Test {

    @Test
    void testVoNghiem() {
        assertEquals("Vo nghiem", Bai3.solve(1, 1, 1));
    }

    @Test
    void testNghiemKep() {
        assertEquals("Nghiem kep", Bai3.solve(1, 2, 1));
    }

    @Test
    void testHaiNghiem() {
        assertEquals("Hai nghiem", Bai3.solve(1, 5, 1));
    }

    @Test
    void testA0B0() {
        assertEquals("Vo nghiem", Bai3.solve(0, 0, 1));
    }

    @Test
    void testA0BKhac0() {
        assertEquals("Mot nghiem", Bai3.solve(0, 2, 1));
    }
}