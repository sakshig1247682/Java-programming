TCS Technical Coding Interview Question (Basic Level)
Problem Statement:
Write a Java program to check whether a given string is a palindrome or not.
A palindrome string is a string that reads the same forward and backward.

Example 1:
Input: "madam"
Output: "Yes, 'madam' is a Palindrome"
Explanation:
Since "madam" reads the same from both sides, it is a palindrome.

Example 2:
Input: "hello"
Output: "No, 'hello' is not a Palindrome"
Explanation:
Since "hello" is different when reversed ("olleh"), it is not a palindrome.

🚀 Java Code for Checking Palindrome String

import java.util.Scanner;

public class PalindromeChecker {  // Class name must match the filename

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If characters at left and right don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true;  // If loop completes, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Checking and printing the result
        if (isPalindrome(input)) {
            System.out.println("Yes, '" + input + "' is a Palindrome");
        } else {
            System.out.println("No, '" + input + "' is not a Palindrome");
        }
    }
}
