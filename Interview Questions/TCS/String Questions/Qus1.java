// TCS Technical Round String-Based Question
// Question: Find the First Non-Repeating Character in a String
// Given a string, find the first non-repeating character and return it. If all characters are repeating, return '-'.

// Example 1:
// Input: "tcsplacement"
// Output: 'p'

// Example 2:
// Input: "aabbcc"
// Output: '-'

import java.util.*;S
public class Qus1 {

    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(firstNonRepeatingChar("tcsplacement")); // Output: 'p'
        System.out.println(firstNonRepeatingChar("aabbcc"));       // Output: '-'
        System.out.println(firstNonRepeatingChar("interview"));    // Output: 'n'
    }
}

