package com.javasnippets;

import java.util.List;
import java.util.stream.Stream;

public class TestCode {

    /**
     * A = [1, 3, 5]
     * B = [1, 2, 3]
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        final var A = List.of(1, 3, 5);
        final var B = List.of(1, 2, 3);

        for(int i=0; i < A.size(); i++) {
            int minBp = 0;
            int minBr = 0;
            for (int l = i-1; l >= 0; l--) {
                if(A.get(i) > A.get(l)) {
                    if (minBp > B.get(l)) minBp = B.get(l);
                }
            }

            for (int r = i + 1; r < A.size(); r++) {
                if(A.get(i) < A.get(r)) {
                    if (minBr > B.get(r)) minBr = B.get(r);
                }
            }

        }

    }
}
