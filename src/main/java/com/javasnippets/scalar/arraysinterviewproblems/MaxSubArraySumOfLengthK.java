package com.javasnippets.scalar.arraysinterviewproblems;

import static java.lang.System.*;

/**
 * Microsoft, Amazon, Facebook
 * <p>
 * Find the max sub array sum with length = k
 *
 * @author harsha
 * @see SubArraysOfLengthK
 */
public class MaxSubArraySumOfLengthK {
    public static void main(String[] args) {
        out.println(solve(new int[]{1, 2, 3, 4, 5}, 1));
        out.println(solve2(new int[]{1, 2, 3, 4, 5}, 1));
        out.println();
        out.println(solve(new int[]{1, 2, 3, 4, 5}, 2));
        out.println(solve2(new int[]{1, 2, 3, 4, 5}, 2));
        out.println();
        out.println(solve(new int[]{1, 2, 3, 4, 5}, 3));
        out.println(solve2(new int[]{1, 2, 3, 4, 5}, 3));
    }

    /**
     *
     * Total Iterations = k(N-k+1)
     * Possible values for k is [1, N]
     *
     * if k = 1, Total Iterations = N
     * If k = N, Total Iterationa = k
     * If k = N/2 Total Iterations = N^2 as approximate
     *
     * Time Complexity = O(n^2)
     * Space Complexity = O(1)
     *
     * @param array
     * @param k
     *
     */
    private static int solve(int[] array, int k) {
        int s = 0;
        int e = k - 1;
        int max = 0;
        while (s <= array.length - k) {
            int sum = 0;
            for (int i = s; i <= e; i++) {
                sum = sum + array[i];
            }
            if(sum > max) max = sum;
            s++;
            e++;
        }
        return max;
    }

    /**
     * Use prefix sum
     *
     * Time Complexity = O(n)
     * Space Complexity = O(n)
     *
     * @param array
     * @param k
     */
    private static int solve1(int[] array, int k) {
        int s = 0;
        int e = k - 1;
        int max = 0;
        while (s <= array.length - k) {
            int sum = 0;
            // TODO replace with prefix sum
            for (int i = s; i <= e; i++) {
                sum = sum + array[i];
            }
            if(sum > max) max = sum;
            s++;
            e++;
        }
        return max;
    }

    /**
     *
     * Sliding window approach
     *
     * Total Iterations = N-k+k
     * Time Complexity = O(n)
     * Space Complexity = O(1)
     *
     * @param array
     * @param k
     */
    private static int solve2(int[] array, int k) {
        int s = 0;
        int e = k - 1;


        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum = sum + array[i];
        }
        s++;
        e++;
        int max = sum;
        while (s <= array.length - k) {
            sum = sum + array[e] - array[s-1];
            if(sum > max) max = sum;
            s++;
            e++;
        }
        return max;
    }

}
