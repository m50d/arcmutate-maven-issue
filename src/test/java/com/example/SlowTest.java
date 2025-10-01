package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Marker.class)
public class SlowTest {
    final Logic underTest = new Logic();

    @Test
    public void isHoopy() throws InterruptedException {
        Thread.sleep(10_000);
        assertTrue(underTest.isHoopy(42));
    }

    @Test
    public void isNotHoopy() throws InterruptedException {
        Thread.sleep(10_000);
        assertFalse(underTest.isHoopy(43));
    }
}
