package com.javasnippets.scalar.session.day15;

/**
 * set = 1
 * unset = 0
 * <p>
 * Given 2 +ve numbers, N and i, check if ith bit in N is set ot unset
 * <p>
 * In order to achieve it, Right shift N by i times and perform bitwise & with 1
 * <p>
 * One more way to acheive the same to N / Math.pow(2, i) and perform bitwise & with 1. (Not efficient)
 */
public class CheckIndexValue {

    public static void main(String[] args) {

        // By doing & we can get the right most bit
        System.out.println(10 & 1);
        System.out.println(11 & 1);

        int N = 10;
        int i = 3;

        /**
         * N = 10  => 1 0 1 0
         * N >> 1  => 0 1 0 1
         * N >> 2  => 0 0 1 0
         * N >> 3  => 0 0 0 1
         */
        System.out.println("The ith bit in N is " + ((N >> i) & 1));

        /**
         *
         * N & (i << i ) =  0 if ith bit is set
         *               != 0 if ith bit is unset
         *
         */
        System.out.println(N & (1 << i));
        System.out.println(N & (1 << i - 1));
    }

    /**
     *
     * @param N the number
     * @param i the index of @param N
     * @return true if ith bit of N is set (1)
     * @return false if ith bit of N is unset (0)
     */
    static boolean checkBitUsingLeftShift(int N, int i) {
        return (N & (1 << i)) != 0;
    }

    /**
     *
     * @param N the number
     * @param i the index of @param N
     * @return true if ith bit of N is set (1)
     * @return false if ith bit of N is unset (0)
     */
    static boolean checkBitUsingRightShift(int N, int i) {
        return ((N >> i) & 1) == 1;
    }
}
