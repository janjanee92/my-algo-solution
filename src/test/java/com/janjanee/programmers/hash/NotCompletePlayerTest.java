package com.janjanee.programmers.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotCompletePlayerTest {

    @Test
    void case1() {
        String result = NotCompletePlayer.solution(new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"});

        assertEquals("leo", result);
    }

    @Test
    void case2() {
        String result = NotCompletePlayer.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"marina", "josipa", "nikola", "filipa"});

        assertEquals("vinko", result);
    }

    @Test
    void case3() {
        String result = NotCompletePlayer.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "mislav", "ana"});

        assertEquals("mislav", result);
    }

}