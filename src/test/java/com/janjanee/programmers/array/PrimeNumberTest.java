package com.janjanee.programmers.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    private final PrimeNumber pn = new PrimeNumber();

    @Test
    void case1() {
        int result = pn.solution(new int[]{1, 2, 3, 4});
        assertEquals(1, result);
    }

    @Test
    void case2() {
        int result = pn.solution(new int[]{1, 2, 7, 6, 4});
        assertEquals(4, result);
    }

}