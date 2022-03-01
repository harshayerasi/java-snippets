package com.javasnippets.scalar.stacks;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class UndoRedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";

        final var undo = new Stack<Integer>();
        undo.addAll(List.of(1, 2, 3, 4, 5, 6));
        final var redo = new Stack<Integer>();

        while(!s.equals("exit")) {
            s = sc.nextLine();

            if("u".equals(s))
                redo.add(undo.pop());

            else if ("r".equals(s))
                undo.add(redo.pop());

            System.out.println(undo.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.println(redo.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
    }
}
