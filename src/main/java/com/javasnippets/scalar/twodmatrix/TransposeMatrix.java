package com.javasnippets.scalar.twodmatrix;

import java.util.Arrays;

/**
 * @since 2021-12-09
 */
public class TransposeMatrix {

    /**
     * Time Complexity  : O(n^2)
     * Space Complexity : O(1)
     *
     * @param args
     */
    public static void main(String[] args) {
        final int[][] array =
                       {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        final int n = array.length;

        System.out.println(Arrays.deepToString(array));

        solve(array, n);

        System.out.println(Arrays.deepToString(array));
    }

    public static void solve(int[][] array, int n) {
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
}
