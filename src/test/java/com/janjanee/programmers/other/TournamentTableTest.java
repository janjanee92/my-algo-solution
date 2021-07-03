package com.janjanee.programmers.other;

import com.janjanee.programmers.hash.NotCompletePlayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTableTest {

    public final TournamentTable tournamentTable = new TournamentTable();

    @Test
    void case1() {
        int answer = tournamentTable.solution(8, 4, 7);
        assertEquals(3, answer);
    }

    @Test
    void case2() {
        int answer = tournamentTable.solution(8, 2, 3);
        assertEquals(2, answer);
    }

    @Test
    void case3() {
        int answer = tournamentTable.solution(8, 1, 2);
        assertEquals(1, answer);
    }
}