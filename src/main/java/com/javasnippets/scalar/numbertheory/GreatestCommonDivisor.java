package com.javasnippets.scalar.numbertheory;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author harsha
 */
public class GreatestCommonDivisor {

    /**
     * @param array
     * @return greatestCommonDivisor
     */
    public static final int calculate(int[] array) {

        final var minimumValue = MinimumValue.calculate(array);

        final var divisors = new HashSet<Integer>();
        divisors.add(1);

        for (int i = 2; i <= minimumValue; i++) {
            if (minimumValue % i == 0)
                divisors.add(i);
        }

        final var commonDivisors = new HashSet<Integer>(divisors);

        for (int divisor : divisors) {
            for (int value : array) {
                if (value % divisor != 0)
                    commonDivisors.remove(divisor);
            }
        }
        int[] cd = new int[commonDivisors.size()];

        return MaximumValue.calculate(cd);
    }
}
