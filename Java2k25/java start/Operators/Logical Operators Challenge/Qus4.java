//Create a program that determines if a given year is leap year(Considering conditions like divisible by 4 but not 100,unless also divisible by 400)


import java.util.Scanner;

public class Qus4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculate leap year!!");
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
       {
            if(year%400 ==0 ||  (year%4==0 &&  year%100 !=0) ){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
    }
}