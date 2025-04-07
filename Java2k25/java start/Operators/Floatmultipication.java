//Create a program to calculate multiplication of two floating point numbers

import java.util.Scanner;

public class Floatmultipication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("We are doing float multiplication!!");
        System.out.print("Enter the first number: ");
        float first = input.nextFloat();
        System.out.print("Enter the second number: ");
        float second = input.nextFloat();

        float result = first * second;
        System.out.println("The multiplication of " + first + " and " + second + " is " + result);
        input.close(); // Close the Scanner object when done with it.

    }
}
