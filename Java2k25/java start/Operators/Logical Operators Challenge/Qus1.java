//Create a program that  determines if a number is positive ,negative or zero

import java.util.Scanner;

public class Qus1 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to number checker!!");
    System.out.print("Enter a number : ");
    int num =input.nextInt();
    if(num>0){
        System.out.println("The number is positive");
    }else if(num==0){
        System.out.println("The number is zero");
    }
    else{
        System.out.println("The number is negative");
    }
}
}
