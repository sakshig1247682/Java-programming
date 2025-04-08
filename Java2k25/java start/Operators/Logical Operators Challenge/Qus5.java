//Create a program that categorize  a person into different age groups 
//!Child ->below 13   Teen->below 20
//Adult ->below 60    Senior->above 60

import java.util.Scanner;

public class Qus5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=60){
            System.out.println("You are a Senior");
        }else if(age >=20){
            System.out.println("You are a Adult");
        }else if(age>=13){
            System.out.println("You are a Teen");
        }else{
            System.out.println("You are a Child");
        }
    }
}
