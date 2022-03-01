package com.javasnippets.scalar.stacks;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Topmost can be accessed
 * Last In First Out (LIFO)
 * Abstract data type
 *      Abstract is logical definition is known
 *
 *  Stack operations ----> Push / Insert
 *                     |-> Pop / Remove
 *                     |-> Top / Peek
 *                     |-> isEmpty
 *                     |-> size
 *
 *  Applications:
 *  1. Undo / Redo
 *  2. Recursion / call stack
 *
 */
public class Stack {


    int size = 10;
    int top = -1;
    int[] arr = new int[size];

    public void push(int... items) {
        for (int item : items) {
            if (top != size - 1) {
                top++;
                arr[top] = item;
                print(" (Array after pushing)");
            } else
                throw new IndexOutOfBoundsException();
        }
    }

    public int pop() {
        if (top > -1) {
            int value = arr[top];
            arr[top] = 0;
            top--;
            print(" (Array after popping)");
            return value;
        } else
            throw new IndexOutOfBoundsException();
    }

    public int top() {
        if (top > -1) {
            return arr[top];
        } else
            throw new IndexOutOfBoundsException();
    }

    private void print(String postfix) {
        System.out.println(Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + postfix);
    }

    public static void main(String[] args) {
        final var stack = new Stack();
        stack.push(1, 2, 3, 4, 5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
