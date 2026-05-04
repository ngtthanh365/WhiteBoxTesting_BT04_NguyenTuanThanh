package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai5Test {

    @Test
    void testPrime() {
        assertTrue(Bai5.isPrime(7));
    }

    @Test
    void testNotPrime() {
        assertFalse(Bai5.isPrime(8));
    }

    @Test
    void testBoundary() {
        assertFalse(Bai5.isPrime(1));
    }
}