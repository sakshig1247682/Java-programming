// Question: Find the Smallest Lexicographical Rotation of a String

// Problem Statement:
// Given a string s, find its smallest lexicographical rotation. A rotation of s is obtained by moving some prefix of s to the end. Among all possible rotations, return the lexicographically smallest one.

// Example 1:
// Input:
// s = "bca"

// Output:
// "acb"

// Explanation:
// The possible rotations are:

// "bca"
// "cab"
// "acb" (Smallest lexicographically)
// Example 2:
// Input:
// s = "geeks"

// Output:
// "eeksg

// Constraints:
// 1 ≤ s.length ≤ 1000
// s contains only lowercase English letters.


import java.util.*;

class Solution3 {
    public String smallestLexicographicalRotation(String s) {
        int n = s.length();
        String doubled = s + s;  // Concatenate the string to handle all rotations
        String minRotation = s;  // Initialize with the original string

        for (int i = 1; i < n; i++) {
            String rotation = doubled.substring(i, i + n);
            if (rotation.compareTo(minRotation) < 0) {
                minRotation = rotation;  // Update if we find a smaller lexicographic string
            }
        }

        return minRotation;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        
        String s1 = "bca";
        System.out.println(sol.smallestLexicographicalRotation(s1)); // Output: "acb"
        
        String s2 = "geeks";
        System.out.println(sol.smallestLexicographicalRotation(s2)); // Output: "eeksg"
    }
}

