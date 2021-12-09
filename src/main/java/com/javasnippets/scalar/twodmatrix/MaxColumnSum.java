package com.javasnippets.scalar.twodmatrix;

/**
 *
 * @since 2021-12-09
 */
public class MaxColumnSum {

    /**
     * O(n^2)
     * @param args
     */
    public static void main(String[] args) {
        final int[][] array =
                       {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}};

        final int n = array.length;
        final int m = array[0].length;

        int max = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + array[i][j];
            }
            if (sum > max) max = sum;
        }
        System.out.println(max);
    }
}
