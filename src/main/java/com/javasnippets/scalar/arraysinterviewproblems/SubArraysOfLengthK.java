package com.javasnippets.scalar.arraysinterviewproblems;

/**
 * Given an array and an input k, print the start and end of all sub arrays of length k
 * <p>
 * <p>
 * Number of sub arrays possible = N - k +1
 *
 * @author harsha
 */
public class SubArraysOfLengthK {
    public static void main(String[] args) {
        solve(new int[]{1, 2, 3, 4, 5}, 2);
        solve1(new int[]{1, 2, 3, 4, 5}, 2);
    }

    /**
     * Brute force approach
     *
     * @param array
     * @param k
     */
    private static void solve(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            if (i + k - 1 < array.length) System.out.println(i + ", " + (i + k - 1));
            else break;
        }
    }

    /**
     * Optimized solution
     *
     * Iterations count = N-k+1
     * Time Complexity = O(N-k)
     * Space Complexity = O(1)
     * @param array
     * @param k
     */
    private static void solve1(int[] array, int k) {
        int s = 0;
        int e = k - 1;
        while (s <= array.length - k) {
            System.out.println(s + ", " + e);
            s++;
            e++;
        }
    }
}
