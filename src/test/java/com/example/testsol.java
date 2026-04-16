package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class testsol {

    @Test
    public void testAdd() {
        solution s = new solution();
        assertEquals(5, s.add(2, 3));
    }

    @Test
    public void testDivideByZero() {
        solution s = new solution();
        assertThrows(IllegalArgumentException.class, () -> {
            s.div(10, 0);
        });
    }
}
