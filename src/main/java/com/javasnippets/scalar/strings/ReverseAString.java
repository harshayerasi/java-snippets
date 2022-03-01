package com.javasnippets.scalar.strings;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(solve("crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv "));
    }

    public static String solve(String A) {
        final String[] strs = A.split(" ");
        String reversed = "";
        for (String str : strs) {
            str = str.replace(" ", "");
            if(reversed == "") reversed = str;
            else if (str != "" && reversed != "") reversed = str + " " + reversed;
        }

        return reversed;
    }
}
