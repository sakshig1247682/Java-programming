//Create a program to calculate compound interest by taking values from user

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) { 
     Scanner input =new Scanner(System.in);
     System.out.print("Enter the principle amount  :");
     int p=input.nextInt();
     System.out.print("Enter the rate of interest  :");
     float r=input.nextFloat();
     System.out.print("Enter the time in years :");
     float t=input.nextFloat();

     double ci=(p*Math.pow(1+(r/100),t));
     System.out.println("The compound interest is :"+ci);
    

    }
    
}