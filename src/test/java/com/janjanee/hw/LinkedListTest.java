package com.janjanee.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    @DisplayName("중첩루프 중복 제거 - Integer")
    void case_1() {
        LinkedList<Integer> list = getIntegerLinkedList();
        list.removeDuplicate();
        assertEquals(7, list.size());
    }

    @Test
    @DisplayName("해시 중복 제거 - Integer")
    void case_2() {
        LinkedList<Integer> list = getIntegerLinkedList();
        list.removeDuplicateWithHash();
        assertEquals(7, list.size());
    }

    @Test
    @DisplayName("중첩루프 중복 제거 - String")
    void case_3() {
        LinkedList<String> list = getStringLinkedList();
        list.removeDuplicate();
        assertEquals(5, list.size());
    }

    @Test
    @DisplayName("해시 중복 제거 - String")
    void case_4() {
        LinkedList<String> list = getStringLinkedList();
        list.removeDuplicateWithHash();
        assertEquals(5, list.size());
    }

    private LinkedList<Integer> getIntegerLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1);
        return list;
    }

    private LinkedList<String> getStringLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("bye");
        list.add("cool");
        list.add("happy");
        list.add("bye");
        return list;
    }

}