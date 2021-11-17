package com.javasnippets.leetcode.easy;

/**
 * @author harsha
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    /**
     *
     * @param nums
     * @return size of the array after removing duplicates
     */
    public static int removeDuplicates(int[] nums) {
        int i = 1, j = 1;
        while (i < nums.length) {
            if (nums[i] != nums[i - 1])
                nums[j++] = nums[i++];
            else
                i++;
        }
        return j;
    }
}
