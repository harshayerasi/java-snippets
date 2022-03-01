package com.javasnippets.scalar.strings;

public class Palindrome {
    public static void main(String[] args) {
        var s = "lol";

        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        for (int start = 0, end = s.length() - 1; start < end + 1; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}
