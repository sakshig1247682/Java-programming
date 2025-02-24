// Most Asked TCS Coding Interview Question:
// Problem: Find the Missing Number in an Array

// Problem Statement:
// You are given an array containing n distinct numbers taken from 1 to n+1. Find the missing number in the array.

// Example 1:
// Input: arr = [1, 2, 4, 6, 3, 7, 8]
// Output: 5

// Example 2:
// Input: arr = [1, 3, 4, 5]
// Output: 2
// No package declaration to avoid running issues
public class findMissingNumber {

    // Method to find the missing number using sum formula
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing, total should be n+1
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num; // Sum of given numbers
        }

        return totalSum - arraySum; // Missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Example input
        System.out.println("Missing number: " + findMissingNumber(arr)); // Expected Output: 5
    }
}

