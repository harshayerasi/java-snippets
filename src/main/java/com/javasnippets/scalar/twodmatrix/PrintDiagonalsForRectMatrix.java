package com.javasnippets.scalar.twodmatrix;

/**
 * Print diagonal elements of a rect matrix from Right to Left
 * <p>
 * Observations:
 * 1. Diagonals can occur in first row and last column
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * @author harsha
 * @since 2021-12-09
 */
public class PrintDiagonalsForRectMatrix {
    public static void main(String[] args) {
        final int[][] array =
                {{1, 2, 3, 4, 17, 18},
                        {5, 6, 7, 8, 19, 20},
                        {9, 10, 11, 12, 21, 22},
                        {13, 14, 15, 16, 23, 24}};
        final int n = array.length;
        final int m = array[0].length;

        for (int j1 = 0; j1 < m; j1++) {
            int i = 0;
            int j = j1;
            while (i < n && j >= 0) {
                System.out.print(array[i][j] + " ");
                j--;
                i++;
            }
            System.out.println();
        }

        for(int i1 = 1; i1 < n; i1++) {
            int i = i1;
            int j = m-1;
            while (i < n && j >= 0) {
                System.out.print(array[i][j] + " ");
                j--;
                i++;
            }
            System.out.println();
        }


    }
}
