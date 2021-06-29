package com.janjanee.programmers.hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * programmers. 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class PhoneBook {
    public static  boolean solution1(String[] phone_book) {
        Set<String> set = Arrays.stream(phone_book).collect(Collectors.toSet());

        for (String key : set) {
            for (int i = 1; i <= key.length() - 1; i++) {
                if (set.contains(key.substring(0, i))) return false;
            }
        }

        return true;
    }

    public static  boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean result = true;
        for (int i=0; i<phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
