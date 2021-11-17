package com.javasnippets.scalar.numbertheory;

/**
 * @author harsha
 */
public class MaximumValue {
    /**
     *
     * @param array
     * @return maximumValue
     */
    public static int calculate(int[] array) {
        int max = 0;

        for (int i : array) {
            if (i > max)
                max = i;
        }

        return max;
    }
}
