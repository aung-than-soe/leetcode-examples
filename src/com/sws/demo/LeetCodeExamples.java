package com.sws.demo;

import java.util.Arrays;

import static com.sws.demo.LengthOfLastWord.lengthOfLastWord;
import static com.sws.demo.LengthOfLastWord.lengthOfLstWord;
import static com.sws.demo.Palindrome.isPalindrome;
import static com.sws.demo.Palindrome.isPalindromeString;
import static com.sws.demo.RemoveDuplicates.removeDuplicates;
import static com.sws.demo.TwoSumOf.sumOf;
import static com.sws.demo.ValidParentheses.isValid;
import static com.sws.demo.ValidParentheses.isValidNotUsingStack;

public class LeetCodeExamples {

    public static void main(String[] args) {
        System.out.println("+++++ Removed duplicate from arrays +++++");
        int[] intArrays = {1, 1, 2, 3, 4, 4};
        System.out.printf("Input : %s \nLength: %d \nResult: %s \n", Arrays.toString(intArrays), removeDuplicates(intArrays), Arrays.toString(intArrays));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Valid Parentheses +++++");
        String parentheses = "{}()[][{}({})]";
        System.out.printf("Input: %s \nResult: %s \n", parentheses, isValid(parentheses));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Valid Parentheses Not using stack +++++");
        String parentheses2 = "{}()[][{}({})]{()[]}";
        System.out.printf("Input: %s \nResult: %s", parentheses2, isValidNotUsingStack(parentheses2));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Palindrome Alphanumeric Only +++++");
        String sentence = "A man, a plan, a canal: Panama";
        System.out.printf("Input: %s \nResult: %s \n", sentence, isPalindrome(sentence));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Palindrome Number Only Without converting to String +++++");
        int palindromeNum = 13231;
        System.out.printf("Input: %d \nResult: %s \n", palindromeNum, isPalindrome(palindromeNum));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Palindrome Digit String format +++++");
        String palindromString = "eye";
        System.out.printf("Input: %s \nResult: %s \n", palindromString, isPalindromeString(palindromString));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Two Sum +++++");
        int[] nums = {1, 3, 4, 0, 9, 2, 7};
        int target = 13;
        System.out.printf("Input: %s & %d \nResult: %s \n", Arrays.toString(nums), target, Arrays.toString(sumOf(nums, target)));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Length of Last Word +++++");
        String lastWord = " ";
        System.out.printf("Input: %s \nResult: %d \n", lastWord, lengthOfLastWord(lastWord));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("+++++ Length of Last Word 2 +++++");
        String lastWord2 = "Hello World";
        System.out.printf("Input: %s \nResult: %d \n", lastWord2, lengthOfLstWord(lastWord2));
        System.out.println("-------------------------------------------------------------------------------");

    }

}
