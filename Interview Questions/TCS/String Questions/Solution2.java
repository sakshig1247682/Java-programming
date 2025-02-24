// Most Asked String Question in Technical Interviews:
// Problem: Longest Substring Without Repeating Characters
//  LeetCode 3: Longest Substring Without Repeating Characters

// Problem Statement:
// Given a string s, find the length of the longest substring without repeating characters.

// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The longest substring without repeating characters is "abc", with length 3.

// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The longest substring without repeating characters is "b", with length 1.


import java.util.HashSet;

public class Solution2 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test Cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Longest substring length of \"" + s1 + "\": " + lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println("Longest substring length of \"" + s2 + "\": " + lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println("Longest substring length of \"" + s3 + "\": " + lengthOfLongestSubstring(s3)); // Output: 3
    }
}
