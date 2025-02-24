// TCS Interview Coding Question
// Problem Statement:
// You are given a number N. Your task is to check whether N is a strong number or not.

// A strong number is a number where the sum of the factorial of its digits is equal to the original number.

// Example 1
// Input: N = 145
// Explanation:

// 1! = 1
// 4! = 24
// 5! = 120
// 1 + 24 + 120 = 145
// Output: "Yes, it is a Strong Number"
// Example 2
// Input: N = 123
// Output: "No, it is not a Strong Number"

import java.util.Scanner;

public class StrongNumber {
    // Function to calculate factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int n) {
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // Extract last digit
            sum += factorial(digit); // Add factorial of the digit
            n /= 10; // Remove last digit
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (isStrongNumber(n)) {
            System.out.println("Yes, it is a Strong Number");
        } else {
            System.out.println("No, it is not a Strong Number");
        }
    }
}
