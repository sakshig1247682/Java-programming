import java.util.Scanner;


public class BitwiseXOR {

        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcasing bitwise operators");
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
    
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
    
        int result=num1 ^ num2;
        System.out.println("result is : " + result);
    
        }
    } 
      


