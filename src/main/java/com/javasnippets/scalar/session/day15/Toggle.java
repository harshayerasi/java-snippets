package com.javasnippets.scalar.session.day15;

/**
 * Toggle the ith bit of N
 */
public class Toggle {

    public static void main(String[] args) {
        int N = 10;
        int i = 2;
        System.out.println(N ^ (1 << i));
        System.out.println(N ^ (1 << i + 1));
    }
}
