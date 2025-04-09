import java.util.Scanner;

public class oddeven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Checking even odd numbers by using bitwise opertors!!");

    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    if((num & 1) == 1){
        System.out.println(num + " is odd");
    }

    else{
        System.out.println(num + " is even");
 }
    }
}
