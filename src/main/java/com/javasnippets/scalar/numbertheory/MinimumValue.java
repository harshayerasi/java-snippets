package com.javasnippets.scalar.numbertheory;

import static java.lang.Integer.MAX_VALUE;

/**
 *
 * @author harsha
 */
public class MinimumValue {

    /**
     *
     * @param array
     * @return minimumValue
     */
    public static int calculate(int[] array) {
        int min = MAX_VALUE;

        for (int i : array) {
            if (i < min)
                min = i;
        }

        return min;
    }
}
