package com.javasnippets.scalar.arraysinterviewproblems;

/**
 * Google
 * <p>
 * Find the number of triplets i, j, k (indices) such that i < j < k such tha a[i] < a[j] < a[k]
 *
 * @author harsha
 */
public class Triplets {

    public static void main(String[] args) {
        /**
         * Array = 2, 6, 9, 4, 10
         * Index = 0, 1, 2, 3, 4
         *
         * 0, 1, 2 | 0, 2, 4 | 0, 3, 4 | 1, 2, 4
         * 0, 1, 4 |
         *
         */
        System.out.println(solve(new int[]{2, 6, 9, 4, 10}));
        System.out.println(solve1(new int[]{2, 6, 9, 4, 10}));
    }

    /**
     * Brute force approach
     *
     * Time complexity  = O(n^3)
     * Space Complexity = O(1)
     *
     * @param array
     * @return count
     */
    private static int solve(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    for (int k = j + 1; k < array.length; k++) {
                        if (array[j] < array[k]) count++;

                    }
                }
            }
        }
        return count;
    }

    /**
     * Optimized solution
     *
     * Time complexity  = O(n^2)
     * Space Complexity = O(1)
     *
     * @param array
     * @return count
     */
    private static int solve1(int[] array) {
        int count = 0;
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 1; i < array.length - 1; i++) {
            for (int l = i - 1; l >= 0; l--) {
                if (array[i] > array[l]) leftCount++;
            }

            for (int r = i + 1; r < array.length; r++) {
                if (array[i] < array[r]) rightCount++;
            }
            count = count + (leftCount * rightCount);
            leftCount = 0;
            rightCount = 0;
        }
        return count;
    }

}
