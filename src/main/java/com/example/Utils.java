package com.example;

public class Utils {
    public static boolean isPalindromeRecursive(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }
}