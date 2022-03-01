package com.javasnippets.scalar.recursion;

public class MagicNumber {

    public static void main(String[] args) {
        System.out.println(solve(83557));
    }

    public static int solve(int A) {

        int sum = sumOfDigits(A);

        if(sum < 10) {
            if(sum != 1) return 0;
            else return 1;
        } else {
            return solve(sum);
        }

    }

    private static int sumOfDigits(int A) {
        if(A == 0) return A;
        return sumOfDigits(A / 10) + (A % 10);
    }
}
