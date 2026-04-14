package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void shouldReturnMinusOneForNullArray() {
        assertEquals(-1, Main.findMax(null));
    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {
        assertEquals(-1, Main.findMax(new int[0]));
    }

    @Test
    void shouldReturnMaxWhenHigherValueAtEnd() {
        assertEquals(9, Main.findMax(new int[]{3, 5, 9, 2}));
    }

    @Test
    void shouldCoverNoUpdateBranchInLoop() {
        assertEquals(5, Main.findMax(new int[]{5, 3, 1}));
    }
}
