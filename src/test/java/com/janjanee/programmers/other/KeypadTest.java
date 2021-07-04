package com.janjanee.programmers.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeypadTest {
    public final Keypad keypad = new Keypad();

    @Test
    void case1() {
        String result = keypad.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        assertEquals("LRLLLRLLRRL", result);
    }

    @Test
    void case2() {
        String result = keypad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        assertEquals("LRLLRRLLLRR", result);
    }

    @Test
    void case3() {
        String result = keypad.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");
        assertEquals("LLRLLRLLRL", result);
    }
}