package com.javasnippets.scalar.assignments.day8;

import java.util.ArrayList;
import java.util.List;

public class MatrixTranspose {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1, 2, 3)),
                new ArrayList<>(List.of(4, 5, 6)),
                new ArrayList<>(List.of(7, 8, 9))
        ));
        System.out.println(solve(A));
    }

    /**
     * A<sup>T</sup>[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row
     *
     * @param A
     * @return transpose of the list
     */
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        final ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

        /** The inner list size will be the new outer list size of transposed matrix */
        final int m = A.get(0).size();

        ArrayList<Integer> transposedRow = null;

        for (int i = 0; i < m; i++) {
            /** Initialize new ArrayList for row */
            transposedRow = new ArrayList<>();
            for (ArrayList<Integer> row : A) {
                transposedRow.add(row.get(i));
            }
            transpose.add(transposedRow);
        }
        return transpose;
    }
}
