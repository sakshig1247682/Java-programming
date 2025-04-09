import java.util.Scanner;


public class Compliment {


        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcasing bitwise operators");
        System.out.print("Enter the  number : ");
        int num = input.nextInt();

        int result= ~num;
        System.out.println("result is : " + result);
    
        }
    } 
      
