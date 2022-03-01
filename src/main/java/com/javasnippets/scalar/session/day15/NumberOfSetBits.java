package com.javasnippets.scalar.session.day15;

import java.util.stream.IntStream;

/**
 * Find number of set bits
 * <p>
 * 0 = 0000
 * 1 = 0001
 * 2 = 0010
 * 3 = 0011
 * 4 = 0100
 * 5 = 0101
 * 6 = 0110
 * 7 = 0111
 * 8 = 1000
 * 9 = 1001
 * 10= 1010
 */
public class NumberOfSetBits {
    public static void main(String[] args) {
        IntStream.range(0, 100)/*.filter(i -> i % 2 == 0)*/.forEach(n -> {
            int r = solve(n);
            System.out.println(n + " " + Integer.toBinaryString(n) + " " + r);
        });
    }

    private static int solve(int N) {
        int setBits;
        if (N == 0) setBits = 0;
        else if (N % 15 == 0) setBits = N / 15;
        else if (N % 7 == 0 || N % 11 == 0 || N % 13 == 0) setBits = 3;
        else if (N % 5 == 0 || N % 3 == 0) setBits = 2;
        else setBits = 1;
        return setBits;
    }
}
