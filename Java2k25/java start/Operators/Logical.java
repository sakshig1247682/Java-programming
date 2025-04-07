import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator ");
        System.out.print("Please enter your age:");
        int age=sc.nextInt();
        System.out.println("Are you female? (true/false):");
        boolean isFemale=sc.nextBoolean();

        if(age<5){
            System.out.println("Ticket price is free");
        } else if(isFemale){
            System.out.println("Ticket price is $5.00");
        }else if(age>60 && !isFemale){
            System.out.println("Ticket price is $7.00");
        } 
        else{
            System.out.println("Ticket price is $6.00");
        }
    }
}
