// 🔥 Most Important TCS Technical Coding Interview Question (String Topic) 🔥

// Problem Statement:
// You are given a string s consisting of lowercase English letters. Your task is to find the longest palindrome that can be formed by rearranging the characters of s.

// 🔹 Input:
// A single string s (1 ≤ |s| ≤ 10⁵), consisting of only lowercase English letters.
// 🔹 Output:
// Print an integer, representing the length of the longest palindrome that can be formed.

// 📝 Example 1:
// Input:

// abccccdd

// Output:

// 7
// ✅ Explanation: The longest palindrome possible is "dccaccd" (or any other valid permutation), which has a length of 7.

// 📝 Example 2:
// Input:

// aabbcc`

// Output:
// 6
// ✅ Explanation: The longest palindrome possible is "abccba", which has a length of 6.

import java.util.*;

public class LongestPalindromePossible {
    public static int longestPalindromeLength(String s) {
        int[] count = new int[128]; // ASCII array to store character frequency
        int maxLength = 0;
        boolean oddFound = false;

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        // Compute the maximum palindrome length
        for (int freq : count) {
            if (freq % 2 == 0) {
                maxLength += freq; // Add even occurrences fully
            } else {
                maxLength += freq - 1; // Use only the even part
                oddFound = true; // Keep track of at least one odd frequency
            }
        }

        return oddFound ? maxLength + 1 : maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestPalindromeLength(s));
        sc.close();
    }
}
