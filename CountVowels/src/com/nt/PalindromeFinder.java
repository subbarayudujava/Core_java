package com.nt;
public class PalindromeFinder {
    public static void main(String[] args) {
        String input = "madam she madam";
        findPalindromes(input);
    }

    public static void findPalindromes(String str) {
        String[] words = str.split(" ");
        
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
