package com.janjanee.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void case_1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Tree tree = new Tree();
        tree.createMinimumHeightBST(arr);
        assertEquals(3, tree.findHeight());
    }

    @Test
    void case_2() {
        int[] arr = {5};
        Tree tree = new Tree();
        tree.createMinimumHeightBST(arr);
        assertEquals(0, tree.findHeight());
    }

    @Test
    void case_3() {
        int[] arr = {1, 3, 5, 7, 8, 10, 15};
        Tree tree = new Tree();
        tree.createMinimumHeightBST(arr);
        assertEquals(2, tree.findHeight());
    }
}