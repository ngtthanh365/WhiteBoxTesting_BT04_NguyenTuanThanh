package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai7Test {

    @Test
    void testBasic() {
        assertEquals(6, Bai7.ucln(54,24));
    }

    @Test
    void testSame() {
        assertEquals(5, Bai7.ucln(5,5));
    }

    @Test
    void testAChiaHetChoB() {
        assertEquals(5, Bai7.ucln(10,5));
    }

    @Test
    void testBChiaHetChoA() {
        assertEquals(5, Bai7.ucln(5,10));
    }

    @Test
    void testChiaHetNgay() {
        assertEquals(4, Bai7.ucln(8,4));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Bai7.ucln(0,5));
    }
}