//Create a program to calculate the simple interest

import java .util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the rate of interest per annum: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest: " + simpleInterest);
        
    }
}
