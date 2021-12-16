package com.javasnippets.scalar.homework.day13;

import java.util.List;

public class MaximumPositivity {
    public static void main(String[] args) {

        solve(List.of(-3674875, 5305422, 7665178, 205505,
                -7168198, -1398091, 5392310, -1700856, 1259052, -3056006));

        solve(List.of(5, 6, -1, 7, 8));

        solve(List.of(1, 2, 3, 4, 5, 6));
    }

    private static void solve(List<Integer> A) {
        int start = -1;
        int end = -1;

        int maxStart = start;
        int maxEnd = end;

        for (int i = 0; i < A.size(); i++) {
            int maxDiff = maxEnd - maxStart;
            if (A.get(i) > 0 && start < 0) {
                start = i;
                end = i + 1;
            } else if (A.get(i) > 0) {
                end++;
            } else if (A.get(i) < 0 && start > 0) {
                start = end + 1;
                end = i;
            }

            if (maxDiff < end - start) {
                maxStart = start;
                maxEnd = end;
            }
        }
        System.out.println(A.subList(maxStart, maxEnd));
    }
}
