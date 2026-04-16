package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class testsol {

    @Test
    public void testAdd() {
        Solution s = new Solution();
        assertEquals(5, s.add(2, 3));
    }

    @Test
    public void testDivideByZero() {
        Solution s = new Solution();
        assertThrows(IllegalArgumentException.class, () -> {
            s.div(10, 0);
        });
    }
}
