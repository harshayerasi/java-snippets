package com.javasnippets.scalar.session.day15;

public class LeftShift {
    /**
     * Every time we do a left shift we are actually multiplying the number by 2
     * Assuming there is no overflow, a << n = a * Math.pow(2, n)
     * <p>
     * Also, Math.pow(2, n) = 1 << n
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(10 << 1);
        System.out.println(10 << 2);
        System.out.println(10 << 3);
        System.out.println(10 << 4);
        System.out.println(10 << 5);
        System.out.println(10 << 6);

        int n = 10;
        System.out.println("Math.pow(2, n) : " + Math.pow(2, n) + " 1 << n : " + (1 << n));

        System.out.println(15 << 2); // QUIZ
    }
}
