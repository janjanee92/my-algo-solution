package com.janjanee.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrintDuplicateNumberAndCountTest {

    @Test
    void case_1() {
        int[] numbers = {6, 4, 4, 1, 2, 2, 10, 3, 3, 1, 1, 3, 2};
        assertEquals("[1:3,2:3,3:3,4:2,6:1,10:1]", PrintDuplicateNumberAndCount.run(numbers));
    }

    @Test
    void case_2() {
        int[] numbers = {30, 4, 10, 2, 3, 3, 4, 4, 1, 1, 1, 1, 1, 2, 2, 3};
        assertEquals("[1:5,2:3,3:3,4:3,10:1,30:1]", PrintDuplicateNumberAndCount.run(numbers));
    }

    @Test
    void case_3() {
        int[] numbers = {1};
        assertEquals("[1:1]", PrintDuplicateNumberAndCount.run(numbers));
    }

}