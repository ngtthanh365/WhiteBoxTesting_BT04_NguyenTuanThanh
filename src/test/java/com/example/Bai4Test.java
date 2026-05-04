package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai4Test {

    @Test
    void test28() {
        assertEquals(28, Bai4.soNgay(2));
    }

    @Test
    void test30() {
        assertEquals(30, Bai4.soNgay(4));
    }

    @Test
    void test31() {
        assertEquals(31, Bai4.soNgay(1));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Bai4.soNgay(13));
    }

    @Test
    void testThang2() {
        assertEquals(28, Bai4.soNgay(2));
    }

    @Test
    void testThang30() {
        assertEquals(30, Bai4.soNgay(6));
    }

    @Test
    void testThang31() {
        assertEquals(31, Bai4.soNgay(7));
    }

    @Test
    void testInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> Bai4.soNgay(0));
    }
}