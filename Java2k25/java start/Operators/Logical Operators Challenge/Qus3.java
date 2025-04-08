//Create a program that determines the greatest number of three numbers

import java.util.Scanner;

public class Qus3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1=input.nextInt();
        System.out.print("Enter your second number: ");
        int num2=input.nextInt();
        System.out.print("Enter your third number: ");
        int num3=input.nextInt();
        if (num1>=num2 && num1>=num3){
            System.out.println("The largest number is num1: "+num1);
        }else if(num2>=num1 && num2>=num3){
            System.out.println("The largest number is num2: "+num2);
        }else{
            System.out.println("The largest number is num3: "+num3);
        }

    }

}
