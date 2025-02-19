// Write a program that takes a decimal (base-10) integer as input and converts it to its binary (base-2) representation.

// Input:

// A single integer N where 0 ≤ N ≤ 10^6.
// Output:

// A string representing the binary equivalent of the decimal number N.
// Example:
// Input:
// 10

// Output:
// 1010

//Explanation: The decimal number 10 is represented as 1010 in binary.


import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);
    }
}
