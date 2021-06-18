package com.janjanee.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangingAnIpAddressTest {

    private static final String IP1 = "1.1.1.1";
    private static final String IP2 = "168.126.63.1";

    @Test
    void case_IP1() {
        String defangIP1 = DefangingAnIpAddress.defangIPaddr(IP1);
        String defangIP2 = DefangingAnIpAddress.defangIPaddr2(IP1);
        String defangIP3 = DefangingAnIpAddress.defangIPaddr3(IP1);

        String expected = "1[.]1[.]1[.]1";
        assertEquals(expected, defangIP1);
        assertEquals(expected, defangIP2);
        assertEquals(expected, defangIP3);
    }

    @Test
    void case_IP2() {
        String defangIP1 = DefangingAnIpAddress.defangIPaddr(IP2);
        String defangIP2 = DefangingAnIpAddress.defangIPaddr2(IP2);
        String defangIP3 = DefangingAnIpAddress.defangIPaddr3(IP2);

        String expected = "168[.]126[.]63[.]1";
        assertEquals(expected, defangIP1);
        assertEquals(expected, defangIP2);
        assertEquals(expected, defangIP3);
    }

}