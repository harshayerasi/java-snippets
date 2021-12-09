package com.javasnippets.scalar.twodmatrix;

import java.util.Arrays;

/**
 * Use the same array (In place)
 *
 * Time Complexity  : O(n^2)
 * Space Complexity : O(1)
 *
 * @since 2021-12-09
 */
public class Rotate90Clockwise {
    public static void main(String[] args) {
        final int[][] array =
                       {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        final int n = array.length;
        TransposeMatrix.solve(array, n);
        System.out.println(Arrays.deepToString(array));


        int temp;

        for(int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp = array[i][j];
                array[i][j] = array[i][n - j - 1];
                array[i][n - j - 1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
