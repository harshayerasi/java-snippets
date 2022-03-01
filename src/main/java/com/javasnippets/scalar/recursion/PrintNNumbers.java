package com.javasnippets.scalar.recursion;

public class PrintNNumbers {
    public static void main(String[] args) {
        print(10, 1);
    }

    private static void print(int endInclusive, int startInclusive) {
        if (endInclusive < startInclusive) return;
        System.out.println(startInclusive);
        print(endInclusive, startInclusive + 1);
    }
}
