package com.javasnippets.scalar.array;

public class ArrayQuery {
    public static void main(String[] args) {
        final var array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final var q = 4;
        final var q1 = new int[]{1, 2};
        final var q2 = new int[]{3, 4};
        final var q3 = new int[]{5, 6};
        final var q4 = new int[]{7, 8};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (q1[0] <= i && q1[1] >= i) sum = sum + array[i];
            if (q2[0] <= i && q2[1] >= i) sum = sum + array[i];
            if (q3[0] <= i && q3[1] >= i) sum = sum + array[i];
            if (q4[0] <= i && q4[1] >= i) sum = sum + array[i];
        }

        System.out.println(sum);

    }
}
