package com.javasnippets.leetcode.easy;


import org.junit.jupiter.api.Test;

import static com.javasnippets.leetcode.easy.RemoveDuplicatesFromSortedArray.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTests {

    @Test
    void testcase001() {
        assertEquals(2, removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(2, removeDuplicates(new int[]{1, 1, 1, 2}));
    }
}
