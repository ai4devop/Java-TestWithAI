package com.example;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void testIsPalindromeRecursive() {
        Assert.assertTrue(Utils.isPalindromeRecursive("madam"));
        Assert.assertTrue(Utils.isPalindromeRecursive("racecar"));
        Assert.assertFalse(Utils.isPalindromeRecursive("hello"));
        Assert.assertTrue(Utils.isPalindromeRecursive(""));
        Assert.assertTrue(Utils.isPalindromeRecursive(null));
    }
}