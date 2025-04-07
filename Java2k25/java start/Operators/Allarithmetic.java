// Create a program that takes two numbers and shows result of all arithmetic operations

import java.util.Scanner;


public class Allarithmetic {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:\n");
        int first=input.nextInt();
        System.out.println("Enter second number:");
        int second=input.nextInt();

        int sum=first+second;
        int sub=first-second;
        int mul=first*second;
        int div=first/second;
        int mod=first%second;

        System.out.println("Sum: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Modulus: "+mod);

        input.close();

    }
}
