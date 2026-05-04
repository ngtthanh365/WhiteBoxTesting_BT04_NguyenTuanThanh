package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai6Test {

    @Test
    void testValid() {
        assertEquals(2, Bai6.tong(3));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Bai6.tong(0));
    }
}