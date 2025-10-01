package com.example.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    final Logic underTest = new Logic();

    @Test
    void isHoopy() {
        assertTrue(underTest.isHoopy(42));
    }

    @Test
    void isNotHoopy() {
        assertFalse(underTest.isHoopy(43));
    }
}
