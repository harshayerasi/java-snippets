package com.javasnippets.scalar.twodmatrix;

/**
 * @author harsha
 * @since 2021-12-09
 */
public class PrintDiagonals {

    /**
     * Time Complexity  : O(n)
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

        solution(array, n);

    }

    private static void solution(int[][] array, int n) {
        int max = Integer.MIN_VALUE;
        System.out.println("First Diagonal");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println("\nSecond Diagonal");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i][n-1-i] + " ");
        }
    }
}
