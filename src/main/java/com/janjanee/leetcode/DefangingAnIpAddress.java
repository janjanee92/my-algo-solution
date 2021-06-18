package com.janjanee.leetcode;

/**
 * leetcode 1108. Defanging an IP Address
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public class DefangingAnIpAddress {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static String defangIPaddr2(String address) {
        return String.join("[.]", address.split("\\."));
    }

    public static String defangIPaddr3(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
