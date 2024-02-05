package com.sws.demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static final String OPENING_BRACKETS = "({[";
    public static final String CLOSING_BRACKETS = ")}]";

    public static boolean isValid(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (isOpeningBracket(current)) {
                stack.push(current);
            } else {
                if (stack.isEmpty() || !isMatching(stack.pop(), current)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return OPENING_BRACKETS.indexOf(c) != -1;
    }

    private static boolean isMatching(char open, char close) {
        return OPENING_BRACKETS.indexOf(open) == CLOSING_BRACKETS.indexOf(close);
    }

    public static boolean isValidNotUsingStack(String s) {
        int n = -1;
        while (s.length() != n) {
            n = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();
    }
}
