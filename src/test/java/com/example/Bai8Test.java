package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai8Test {

    @Test
void testFactorial0() {
    assertEquals(1, Bai8.factorial(0));
}

@Test
void testFactorial() {
    assertEquals(120, Bai8.factorial(5));
}

@Test
void testTong1() {
    assertEquals(1, Bai8.tong(1));
}

@Test
void testTong3() {
    assertEquals(9, Bai8.tong(3)); // 1+2+6
}

@Test
void testInvalid() {
    assertThrows(IllegalArgumentException.class, () -> Bai8.tong(0));
}
}