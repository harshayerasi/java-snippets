package com.javasnippets.scalar.session.day15;

public class RightShift {

    /**
     * Right shift is shifting the number to right, the right most will be lost
     *
     * Every time we do a left shift we are actually dividing the number by 2
     *
     * Example:
     *  a = 20  => 0 0 0 1 0 1 0 0 = 20
     *  a >> 1  => 0 0 0 0 1 0 1 0 = 10
     *  a >> 2  => 0 0 0 0 0 1 0 1 = 5
     *  a >> 3  => 0 0 0 0 0 0 1 0 = 2
     *  a >> 4  => 0 0 0 0 0 0 0 1 = 1
     *  a >> 5  => 0 0 0 0 0 0 0 0 = 0
     *
     * The generalized equation for Right shift is if  a >> n = a / Math.pow(2, n)
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(100 >> 1);
        System.out.println(100 >> 2);
        System.out.println(100 >> 3);
        System.out.println(100 >> 4);

        System.out.println(29 >> 2); // QUIZ
    }
}
