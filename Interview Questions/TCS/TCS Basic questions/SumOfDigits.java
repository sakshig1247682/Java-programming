// TCS Coding Question: Sum of Digits
// Problem Statement:

// Write a program that takes a positive integer n as input and returns the sum of its digits.

// Input:
// A single integer n (1 ≤ n ≤ 10^6).
// Output:
// Output a single integer representing the sum of the digits of n.

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input integer
        int n = scanner.nextInt();
        
        // Call the function to get the sum of digits
        int result = sumDigits(n);
        
        // Print the result
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
    }

    // Function to calculate the sum of digits
    public static int sumDigits(int n) {
        int sum = 0;
        
        // Loop through all digits and add them to sum
        while (n > 0) {
            sum += n % 10;  // Add the last digit to sum
            n = n / 10;     // Remove the last digit
        }
        
        return sum;
    }
}
