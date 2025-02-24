//TCS Technical Coding Interview Question (String Topic)
// Question:
// Given a string s, remove all adjacent duplicate characters recursively until no adjacent duplicates remain.

// Example 1:
// Input:
// s = "abbaca"

// Output:
// "ca"

// Explanation:

// Remove "bb" → "aaca"
// Remove "aa" → "ca"
// Final string: "ca"
// Example 2:
// Input:
// s = "azxxzy"

// Output:
// "ay"

import java.util.*;

class Solution {
    public static String removeAdjacentDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();  // Remove adjacent duplicate
            } else {
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();  // Reverse since we used a stack
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        
        String result = removeAdjacentDuplicates(s);
        System.out.println("Final String after removing adjacent duplicates: " + result);
        
        sc.close();
    }
}
