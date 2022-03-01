package com.javasnippets.scalar.recursion;

public class Palindrome {

    public static void main(String[] args) {
        final var s = "lool";
        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start == end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        if (start < end + 1)
            return isPalindrome(s, start + 1, end - 1);
        return true;
    }
}
