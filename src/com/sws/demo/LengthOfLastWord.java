package com.sws.demo;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String str) {
        int i = str.length() - 1, length = 0;
        while (i >= 0 && str.charAt(i) == ' ') i--;
        while (i >= 0 && str.charAt(i) != ' ') {
            i--;
            length++;
        }
        return length;
    }

    public static int lengthOfLstWord(String str) {
        int i = str.length() - 1, length = 0;
        while (i >= 0 && str.charAt(i) != ' ') {
            i--;
            length++;
        }
        return length;
    }
}
