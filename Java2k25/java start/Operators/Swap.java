import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int A=input.nextInt();
        System.out.print("Enter the value of B:");
        int B=input.nextInt();
     //Swapping logic
        int C=A;
        A=B;
        B=C;
        System.out.println("Swapping done....");

        System.out.println("Value of A :"+A);
         System.out.print("Value of B :"+B);

    }
}
