// TCS Technical Coding Interview Question:
// Problem: Reverse a Number
// Problem Statement:
// Write a Java program to reverse a given integer number. The program should take an integer as input and return its reverse.

// Example 1:
// Input: 1234
// Output: 4321

// Example 2:
// Input: -5678
// Output:-8765

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit from num
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
    }
}
