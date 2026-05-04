package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai2Test {
    @Test
    void testValid() {
        assertEquals(15, Bai2.dienTich(5, 3));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Bai2.dienTich(0, 3));
    }

    @Test
    void testAAm() {
        assertThrows(IllegalArgumentException.class, () -> Bai2.dienTich(-1, 5));
    }

    @Test
    void testBAm() {
        assertThrows(IllegalArgumentException.class, () -> Bai2.dienTich(5, -1));
    }
}