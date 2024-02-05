package com.sws.demo;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char c = str.charAt(i), d = str.charAt(j);

            if(!Character.isLetterOrDigit(c)) {
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(d)) {
                j--;
                continue;
            }

            if(c != d) return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int copy = num, reverse = 0;
        while (copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy /= 10;
        }
        return num == reverse;
    }

    public static boolean isPalindromeString(String str) {
        str = str.toLowerCase();
        int mid = str.length() / 2;
        int i = 0, j = str.length() - 1;
        while (i <= mid) {
            char c = str.charAt(i), d = str.charAt(j);
            if(c != d) return false;
            i++;
            j--;
        }
        return true;
    }
}
