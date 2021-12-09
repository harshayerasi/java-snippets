package com.javasnippets.scalar.array;

import java.util.Arrays;

public class RotatingElements {

    public static void main(String[] args) {
        final var array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        final var k = 5;

        var start = array.length - k;

        int i = 0;

        while(i < k) {
            int temp = array[i];
            array[i] = array[start];
            array[start] = temp;
            i++;
            start++;
        }

        System.out.println(Arrays.toString(array));


    }
}
