package com.aitesting.stringhelper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringHelperTest {

  @Test
  public void isPalindromeTest() {
    Assertions.assertTrue(StringHelper.isPalindrome("radar"));
    Assertions.assertTrue(StringHelper.isPalindrome("racecar"));
    Assertions.assertFalse(StringHelper.isPalindrome("hello"));
    Assertions.assertTrue(StringHelper.isPalindrome(""));
    Assertions.assertTrue(StringHelper.isPalindrome(null));
  }

  @Test
  public void isAnagramTest() {
    // cas simple
    Assertions.assertTrue(StringHelper.isAnagram("listen", "silent"));
    Assertions.assertTrue(StringHelper.isAnagram("triangle", "integral"));
    Assertions.assertFalse(StringHelper.isAnagram("abc", "abcd"));
    Assertions.assertFalse(StringHelper.isAnagram("hello", "world"));

    // anagramme non sensible à la case
    Assertions.assertTrue(StringHelper.isAnagram("Listen", "Silent"));

    // anagramme avec des phrases
    Assertions.assertTrue(StringHelper.isAnagram("a gentleman", "elegant man"));
    Assertions.assertFalse(StringHelper.isAnagram("ohello world", "world hello o"));

    // cas de bord à tester
    Assertions.assertTrue(StringHelper.isAnagram("", ""));
    Assertions.assertFalse(StringHelper.isAnagram("test", null));
    Assertions.assertFalse(StringHelper.isAnagram(null, null));
  }

  @Test
  public void toCamelCaseTest() {
    // cas simples
    Assertions.assertEquals("HelloWorld", StringHelper.toCamelCase("hello world"));
    Assertions.assertEquals("JavaProgramming", StringHelper.toCamelCase("java programming"));

    // cas un mot
    Assertions.assertEquals("Hello", StringHelper.toCamelCase("hello"));
    Assertions.assertEquals("World", StringHelper.toCamelCase("WORLD"));

    // cas avec cases différentes
    Assertions.assertEquals("HelloWorld", StringHelper.toCamelCase("Hello World"));
    Assertions.assertEquals("JavaProgramming", StringHelper.toCamelCase("JAVA programming"));

    // cas avec espaces
    Assertions.assertEquals("HelloWorld", StringHelper.toCamelCase("   hello   world   "));

    // cas de bord
    Assertions.assertNull(StringHelper.toCamelCase(null));
    Assertions.assertEquals("", StringHelper.toCamelCase(""));
  }


}