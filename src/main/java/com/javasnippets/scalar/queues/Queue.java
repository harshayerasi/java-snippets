package com.javasnippets.scalar.queues;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * First In First Out
 */
public class Queue {

    int size;
    int[] arr;
    int firstIndex = -1;
    int lastIndex = -1;

    public Queue(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void enqueue(int item) {
        lastIndex++;
        arr[lastIndex] = item;
        firstIndex = 0;
        print(" (After enqueing)");
    }

    public int dequeue() {
        int value = arr[firstIndex];
        arr[firstIndex] = 0;
        firstIndex++;
        print(" (After dequeuing)");

        if (firstIndex > lastIndex) {
            firstIndex = -1;
            lastIndex = -1;
        }

        return value;
    }

    private void print(String postfix) {
        System.out.println(Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + postfix);
    }

    public static void main(String[] args) {
        final var q = new Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }


}
