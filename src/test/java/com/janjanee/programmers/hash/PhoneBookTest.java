package com.janjanee.programmers.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void case1() {
        String[] phone_book = {"119", "97634234", "11966324"};
        test(phone_book);
    }

    @Test
    void case2() {
        String[] phone_book = {"123", "456", "789"};
        test(phone_book);
    }

    @Test
    void case3() {
        String[] phone_book = {"12", "123", "1235", "567", "88"};
        test(phone_book);
    }

    private void test(String[] phone_book) {
        boolean result1 = PhoneBook.solution1(phone_book);
        boolean result2 = PhoneBook.solution2(phone_book);
        assertFalse(result1);
        assertFalse(result2);
    }

}