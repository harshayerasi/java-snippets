package com.javasnippets.scalar.arraysinterviewproblems;

/**
 * Given a binary array, we are allowed to replace almost one 0 with a  1
 * Return the length of max consecutive 1's
 * <p>
 * There is also a other version of same question, instead of replacing we have to swap an existing 1.
 * That approach is available in solve1
 *
 * @author harsha
 */
public class BinaryArrayMaxLength {


    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(solve(new int[]{1, 1, 1, 1}));
        System.out.println(solve(new int[]{0}));

        System.out.println(solve1(new int[]{1, 1, 1, 0, 1, 1, 0}));
        System.out.println(solve1(new int[]{1, 1, 1, 0, 1, 1, 0, 1}));

        // 010100110101
        System.out.println(solve1(new int[]{0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1}));
    }

    /**
     * The Complexity here is O(1)
     * This is an example where inner for loops is not always O(n^2)
     * <p>
     * Here at most we visit an index 3 times and not more than that
     *
     * @param array
     */
    private static int solve(int[] array) {
        int leftCount = 0;
        int rightCount = 0;

        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            final var value = array[i];
            if (value == 0) {
                /** Find the length of 1's to the left */
                for (int l = i - 1; l >= 0; l--) {
                    if (array[l] == 1) leftCount++;
                    else break;
                }

                /** Find the length of 1's to the right */
                for (int r = i + 1; r < array.length; r++) {
                    if (array[r] == 1) rightCount++;
                    else break;
                }

                int sum = leftCount + rightCount + 1;
                if (ans < sum) ans = sum;
                leftCount = 0;
                rightCount = 0;
            }
        }
        if (ans != 0) return ans;
        else return array.length;
    }

    /**
     * This method body is all same except that the logic for sum calculation now changes
     *
     * @param array
     * @return
     */
    private static int solve1(int[] array) {

        int countOf1 = 0;
        for (int i : array) {
            if (i == 1) countOf1++;
        }

        int leftCount = 0;
        int rightCount = 0;

        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            final var value = array[i];
            if (value == 0) {
                /** Find the length of 1's to the left */
                for (int l = i - 1; l >= 0; l--) {
                    if (array[l] == 1) leftCount++;
                    else break;
                }

                /** Find the length of 1's to the right */
                for (int r = i + 1; r < array.length; r++) {
                    if (array[r] == 1) rightCount++;
                    else break;
                }

                int sum = leftCount + rightCount;
                if (ans < sum) ans = sum;
                leftCount = 0;
                rightCount = 0;
            }
        }
        if (ans != 0) return ans < countOf1 ? ans + 1 : ans;
        else return array.length;
    }
}
