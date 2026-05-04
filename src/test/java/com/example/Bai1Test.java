package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai1Test {

    @Test
    void testValid() {
        assertEquals(16, Bai1.chuVi(5, 3));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Bai1.chuVi(-1, 3));
    }

    @Test
    void testA0() {
        assertThrows(IllegalArgumentException.class, () -> Bai1.chuVi(0, 5));
    }

    @Test
    void testB0() {
        assertThrows(IllegalArgumentException.class, () -> Bai1.chuVi(5, 0));
    }
}
